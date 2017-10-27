package string;

public class ValidNumber {
	
		public static int isNumber(final String a) {
		    
		    int i,len;
		    len = a.length();
		    
		    i=0;
		    //scip space untill we find a digit
		    while(i<len && (a.charAt(i))==' ')
		        i++;
		        
		    if(i==len)
		        return 0;
		    
		    int dot,e;
		    dot = 0; 
		    e = 0;
		    
		    char c;
		    int plusMinus = 0, digit = 0;
		    while(i<len){
		        c = a.charAt(i);
		        
		       if(c=='.'){
		           //i+1, '.' should not present at last.
		           //dot>0, A number can have at most one '.'
		           //e>0, dot should not come after e
		           if((i+1==len) || (dot>0) || (e>0)) 
		                return 0;
		                
		           //'.' must be followed by a digit
		           //Ex-2.e should fail
		           if(!Character.isDigit(a.charAt(i+1)))
		                return 0;
		           dot++;
		           
		       }else if(c=='e'){
		            
		            //'e' shouldn't be present either at 1st place or at last place
		            //e>0, At most one 'e' is possible
		           if((i==0) || (i+1==len) || (e>0)) 
		                return 0;
		                
		           //'e' must be follwed by either a digit, '+', or '-'
		           if(!Character.isDigit(a.charAt(i+1))){
		               if(a.charAt(i+1)!='-'){
		                   if(a.charAt(i+1)!='+'){
		                       return 0;
		                   }
		               }
		           }
		           
		           e++;     
		           
		       }else if(c=='+' || c=='-'){
		           //ignore +/- at first place.
		           if(i!=0){
		             //+/-  can't be at last position.
		             //+/- can't be more than twice.
		             //Ex- "-01.1e-10" should pass
		             if(i+1==len || plusMinus>1)
		                return 0;
		             //if +/- is not at first place then +/- must follow 'e'
		             else if(a.charAt(i-1)!='e')
		                 return 0;
		           }
		           plusMinus++;     
		       }else if(c==' '){
		            //skip the space if we are at last
		            if(i+1!=len){
		                //if there is a space between two digit return 0
		                //Ex - "1 2", "1123.23   9","+   " should fail
		                //Ex - "+   " we handle this case below.
		                if(Character.isDigit(a.charAt(i+1)))
		                    return 0;
		            }
		       }
		       else if(c<48 || c>57)
		            return 0;
		       else
		            digit++;
		             
		       i++;     
		    } 
		    //Ex - "+   " 
		    if(digit==0)
		        return 0;
		    return 1;
		}

	
	public static void main(String[] args) { 
		String s = "   2.3e+2";
		double d = 1e+3;
		//if(s.charAt(0)>= 48 && s.charAt(0)<=57)
			System.out.println(isNumber(s));
	}
}
