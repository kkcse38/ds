public class GenerateAllParentheses {
    public int isValid(String A) {
        
        Stack<Character> s = new  Stack<Character>();
        
        if(A.length() == 1)
            return 0;
        
        int i = 0;
        char c;
        while(i < A.length()){
            
            c = A.charAt(i);
            
            if(c == '(' || c == '{' || c == '[')
                s.push(c);
            else if(c==')'){
                
            if(s.isEmpty() || s.pop() != '(')
                    return 0;
            }else if(c == '}'){
                
            if(s.isEmpty() || s.pop() != '{')
                    return 0;  
            }else if(c == ']'){
                if(s.isEmpty() || s.pop() != '[')
                    return 0;
            }
            
            i++;    
        }
        
        if(!s.isEmpty())
            return 0;
        return 1;
    }
}
