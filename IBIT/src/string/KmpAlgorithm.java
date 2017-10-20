package string;

public class KmpAlgorithm {
	
	public static int[] computeLpsArray(String pat) {
		int len = pat.length();
		int[] lps = new int[len];
		
		lps[0] = 0;
		int i = 1, j = 0;
		while(i<len) {
			if(pat.charAt(j) == pat.charAt(i)) {
				j++;
				lps[i] = j;
				i++;
			}
			else {
				if(j!=0) {
					/*We again go back in lps[] and start matching from the index where it matches last time.*/
					j = lps[j-1];
				}else {
					/*if j==0 means we are at the first 0thvplace in lps[] and we haven't got any match*/
					lps[i] = 0;
					i++;
				}
			}
		}
		
		

		
		return lps;
	}
	
	public static void kmpPatSearch(String text,String pat) {
		
		//System.out.println("sdvsd");
		int lps[] = computeLpsArray(pat);
		
//		for(int i1 = 0; i1<lps.length; i1++)
//			System.out.println(lps[i1]);
//		System.out.println();
		
		int M = pat.length();
		int N = text.length();
		int i = 0, j = 0, count = 0;
		
		while(i < N) {
			
			if(text.charAt(i) == pat.charAt(j)){
				i++;
				j++;
			}
			
			if(j==M){
				System.out.println("Found pattern at "+(i-j));
				j = lps[j-1];
				count++;
			}
			
			else if(i<N && (text.charAt(i) != pat.charAt(j))){
				if(j!=0)
					j = lps[j-1];
				else
					i=i+1;
			}
			
		}
		if(count==0)
			System.out.println("-1");
		
	}
	public static void main(String[] args) {
		String text = "AAAAABAAABA";
		String pat = "AAAA";
//		String txt = "ABABDABACDABABCABAB";
//		String pat = "ABABAC";
		kmpPatSearch(text,pat);
	}

}
