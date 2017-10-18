package math;


public class ReverseInteger {
	public static int reverse(int a) {
	    
	    int temp=0;
	    if(a==0)
	        return 0;
	    else if(a < 0){
	        a = a*(-1);
	        temp++;
	    }
	        
	    int rev_num = 0,prev_rev = 0;
	    while(a > 0){
	        int curr_digit = a%10;
	        rev_num = (rev_num * 10) + curr_digit;
	        
	        if((rev_num - curr_digit)/10!=prev_rev) {
	        	System.err.println("Size Overflow\n");
	        	return 0;
	        }
	        	
	        prev_rev = rev_num;
	        a = a/10;
	    }  
	    /*
	     *  if(r >= Integer.MAX_VALUE)
	    return 0;
	      */
	   
	    
	    if(temp!=0)
	        rev_num = rev_num*(-1);
	    return (int)rev_num;     
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(1000000045));
	}
}
