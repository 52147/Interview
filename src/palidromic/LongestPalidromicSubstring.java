package palidromic;

public class LongestPalidromicSubstring {
	
	public String longestPalindrome(String s) {
		
		if(s == null || s.length() < 1) {
			return "";
		}
		
		int start = 0;
		int end = 0;
		
		for(int i = 0 ; i < s.length(); i++) {
			int len1 = expand(s, i , i);
			int len2 = expand(s, i, i + 1);
			
			int len = Math.max(len1, len2);
			
			if(len > end - start) {
				start = i - (len - 1)/2;
				end = i + len/2;
			}
			
		}
		
		return s.substring(start, end + 1);
		
		
		
	}
	
	
	private int expand(String s, int left, int right) {
		
		int L = left;
		int R = right;
		
		
		while(L >= 0 && R < s.length() && s.charAt(R) == s.charAt(L) ) {
			L--;
			R++;
			
		}
		
		return (R-1) - (L+1) + 1; // R - L - 1
		
		
	}
	

}
