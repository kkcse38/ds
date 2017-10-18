package math;

public class PowerOfInteger {
	
	public static boolean isPowerOfInteger(int n) {
		
		if(n==1)
			return true;
			
		int root = (int)Math.sqrt(n);
		
		for(int x=2; x<=root; x++) {
			//double y = 2;
		double y = x;
			while(y<=n) {
				y = x*y;
				System.out.println(y);
				if(y==n)
					return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		//System.out.println(isPowerOfInteger(1024000000));
		System.out.println(isPowerOfInteger(1));
	}
}
