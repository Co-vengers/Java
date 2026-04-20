import java.util.List;
import java.util.ArrayList;

public class FrogJump{
	public int fromJump(int n, List<Integer> heights){
		if(n == 0) return 0;

		int left = fromJump(n-1, heights) + Math.abs(heights.get(n) - heights.get(n-1));

		int right = Integer.MAX_VALUE;
		if(n > 1){
			right = fromJump(n-2, heights) + Math.abs(heights.get(n) - heights.get(n-2));
		}
		return Math.min(left, right);
	}	

	public static void main(String args[]){
		List<Integer> heights = new ArrayList<>(List.of(10, 20, 30, 10));

		FrogJump f1 = new FrogJump();
		System.out.println(f1.fromJump(heights.size()-1, heights));
	}
}