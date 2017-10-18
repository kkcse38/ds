package math;

public class IsPalindrom {
	
	public static int isPalindrom(int n) {
		
		int m = n;
		int rev = 0;
		while(n>0) {
			int curr_num = n%10;
			rev = rev*10 + curr_num;
			n = n/10;
		}
		if(rev==m)
			return 1;
		return 0;
	}
	
	public static void main(String[] args) {
		
		int n = 1231;
		System.out.println(isPalindrom(n));
		
	}
}
