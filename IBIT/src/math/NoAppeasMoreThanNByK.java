package math;


import java.util.HashMap;
import java.util.Iterator;

public class NoAppeasMoreThanNByK {
	
	

	private static void greaterTthanNByK(int[] arr,int k) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>(arr.length/k);
		
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		
		int r = arr.length/k;
		
		for(Integer key: map.keySet()) {
			if(map.get(key) > r)
				System.out.print(key+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int arr[] = {3, 1, 2, 2, 1, 2, 3, 3};
		int k = 4;
		greaterTthanNByK(arr,k);
	}	
		

}
