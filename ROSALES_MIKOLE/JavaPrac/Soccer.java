import java.util.*;

public class Soccer{
	public static void main(String[] args) {
		Scanner goalScore = new Scanner(System.in);
		int n = 100; // entries scored
		int teamOneCount = 0;
		int teamTwoCount = 0;
		System.out.println("[1] for Team1 : [2] for Team2 : [0] Game Over");
			for(int i = 1; i <=n; i++){
				int goal = goalScore.nextInt();// input 1 || 2
				if(goal == 1){
					teamOneCount++;
				}
				if(goal == 2){
					teamTwoCount++;
				}
				if(goal == 0){ // program terminator
					break;
				}
			}
			// Score Chart
			System.out.println("\nTeam1 scored "+teamOneCount);
			System.out.println("Team2 scored "+teamTwoCount);
			// Match Results
			if(teamOneCount == teamTwoCount){
				System.out.println("\nBoth Tied");
			}
			if(teamOneCount > teamTwoCount){
				System.out.println("\nTeam 1 Won!");
			}
			if(teamOneCount < teamTwoCount){
				System.out.println("\nTeam 2 Won!");
			}
	}
}