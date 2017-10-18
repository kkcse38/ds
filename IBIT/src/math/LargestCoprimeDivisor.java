package math;

import java.util.Scanner;

public class LargestCoprimeDivisor {
	
	public static int gcd(int a,int b){
		if(b%a==0)
			return a;
		return gcd(b%a,a);
	}
	
	public static int largestComprimeDiv(int a,int b){
		
		int x,x2,r = (int)Math.sqrt(a);
		
		int divisior = 1;
	
		for(x = 2; x<=r; x++) {
			
			x2 = a/x;
			
			if(a%x2==0 && b%x2!=0) {
				if(gcd(x2,b)==1) {
					if(x2 > divisior)
						divisior = x2;
				}
					
			}
			
			if(a%x==0 && b%x!=0) {

				if(gcd(x,b)==1) {
					if(x > divisior)
						divisior = x;
				}
					
			}
		}
		return divisior;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(largestComprimeDiv(sc.nextInt(),sc.nextInt()));
		
	}

}
