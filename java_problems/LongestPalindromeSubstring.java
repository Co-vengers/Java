public class LongestPalindromeSubstring{
	public boolean palindrome(int l, String s, int r){
		boolean flag = true;
		for(int i = 0 ; i < r / 2 ; i++){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
				flag = false;
				break;
			}
		}
		return flag;
	}

	public String compute(int l, String s, int r, String ans){
		if(l > r) return ans;

		if(palindrome(l, s, r)){
			ans = s.substring(l, r+1);
			return ans;
		}

		compute(l+1, s, r, ans);
		compute(l, s, r-1, ans);
		return ans;
	}

	public static void main(String args[]){
		LongestPalindromeSubstring obj = new LongestPalindromeSubstring();
		String s = "babad";
		String ans;
		System.out.println(obj.compute(0, s, s.length()-1), ans);
	}
}