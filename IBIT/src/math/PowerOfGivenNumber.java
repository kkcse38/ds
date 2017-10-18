package math;

import java.util.Scanner;

public class PowerOfGivenNumber {
	
	public static int isPowerOf(int n,int x) {
		
		while(n!=1) {
			if(n%x!=0)
				return 0;
			n = n/x;
		}
		return 1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number and base number");
		System.out.println(isPowerOf(sc.nextInt(),sc.nextInt()));
	}

}
