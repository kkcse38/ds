package stack;

import java.util.*;

public class NearestSmallerElement{

    public static List<Integer> prevSmaller(List<Integer> A) {
        
        if(A.isEmpty())
            return A;
            
        ArrayList<Integer> l = new ArrayList<Integer>();
        Stack<Integer> s = new Stack<Integer>();

        //Since last element has no smaller element so put -1
        s.push(-1); 
        l.add(-1);
         
        //Traverse the element of list
        for(int i=1; i<A.size(); i++){
            
            if(A.get(i) > A.get(i-1)){
                l.add(A.get(i-1));
                s.push(A.get(i-1));
            }
            else{
                //pop the stack untill top elt is greater than cureent elt
                while(s.size()>1 && s.peek() >= A.get(i))
                    s.pop();
                l.add(s.peek());
                s.push(A.get(i));  
            }    
        }
        return l;
    }

    public static void main(String[] args) {

        Integer arr[] = new Integer[]{2,5,1,12,6,0,1,6};
        //ArrayList<Integer> list = new ArrayList<>();
        System.out.println(prevSmaller(Arrays.asList(arr)));
    }
}