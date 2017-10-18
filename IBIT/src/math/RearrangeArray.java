package math;

import java.util.ArrayList;

public class RearrangeArray {
	public static void arrange(ArrayList<Integer> a) {
	    
	    int n = a.size();
	    
	    for(int i=0; i<n; i++) {
	    	int num = a.get(i)+ (a.get(a.get(i))%n)*n;
	    	a.set(i,num);
	    }
	            
	   
	     for(int i=0; i<n; i++) 
	    	 a.set(i, a.get(i)/n);
	     

	     for(int i=0; i<n; i++) 
	    	 System.out.print(a.get(i)+" ");        
	     
	        
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(0);
		list.add(2);
		list.add(1);
		list.add(3);
		arrange(list);
	}
}
