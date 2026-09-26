public class PalindromeRecursive{
	// public boolean palindrome(int l, String s, int r){
	// 	if(l >= r){
	// 		return true;
	// 	}

	// 	if(s.charAt(l) != s.charAt(r)){
	// 		return false;
	// 	}

	// 	return palindrome(l++, s, r--);
	// }

	public static void main(String args[]){
		String s = "racecarr";
		boolean flag = false;
		for(int i = 0 ; i < s.length() / 2 ; i++){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("Not palindrome");
		}
		else{
			System.out.println("palindrome");
		}
	}
}