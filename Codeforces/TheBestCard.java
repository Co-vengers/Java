import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class TheBestCard{
	boolean validate(int n, boolean flag, Map<Integer, Integer> freq){
		for(int i = 2 ; i < 2+n ; i++){
			if(n % )
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Map<Integer, Integer> freq = new HashMap<>();

		while(t--){
			int n = sc.nextInt();

			bool flag = false;
			flag = validate(n, flag, freq);
			if(flag){
				System.out.println("YES");
			}
		}
	}
}