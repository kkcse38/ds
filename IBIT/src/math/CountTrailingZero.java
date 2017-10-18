package math;

import java.util.Scanner;

public class CountTrailingZero {
	
	public static int countZero(int n) {
		if(n<5)
			return 0;
		int count = 0;
		
		while(n > 0) {
			count = count  + n/5;
			n = n/5;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(countZero(sc.nextInt()));
	}

}
