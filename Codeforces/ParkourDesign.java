import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class ParkourDesign {
	private Set<String> deadEnds = new HashSet<>();

	public boolean parkour(int currX, int currY, int tarX, int tarY){
		if(currX == tarX && currY == tarY){
			return true;
		}

		if(currX > tarX){
			return false;
		}

		String state = currX + " " + currY;
		if(deadEnds.contains(state)){
			return false;
		}

		if(parkour(currX + 2, currY + 1, tarX, tarY) || 
			parkour(currX + 3, currY, tarX, tarY) || 
			parkour(currX + 4, currY - 1, tarX, tarY)){
			return true;
		}

		deadEnds.add(state);
		return false;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while(t-- > 0){
			if(sc.hasNextInt()){
				int x = sc.nextInt();
				int y = sc.nextInt();

				ParkourDesign par = new ParkourDesign();
				boolean isReachable = par.parkour(0, 0, x, y);

				if(isReachable){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
			}
		}
		sc.close();
	}	
}
