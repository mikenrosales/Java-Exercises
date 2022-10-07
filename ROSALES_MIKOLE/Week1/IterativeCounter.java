import java.util.*;

public class IterativeCounter{
	public static void main(String[] args) {
		Scanner gradeSubj = new Scanner(System.in);
		Scanner unitSubj = new Scanner(System.in);
		// System.out.println("Enter Grades for the 7 subjects:");
			int n = 7; // subjs
			float sum = 0f;
			float gwa = 0f;
			float sumGwa = 0f;
			float sumUnit = 0f;
			for(int i = 1; i<=n; i++){
				System.out.print("Entry ["+i+"] Enter Grade: ");
				float grade = gradeSubj.nextFloat();// user imput 7 subjs
				System.out.print("Enter Corresponding Unit for this subject: ");
				int unit = unitSubj.nextInt();// user input 7 units
				System.out.println("=========================================");
				
				sumUnit += unit;
				gwa = grade * unit;
				sumGwa += gwa;
				sum += grade; // adds all grades
			}

			// System.out.println("The average is "+sum / (float)n);
			System.out.printf("The average is %.2f\n", sum / (float)n);
			// System.out.println("The GWA is "+sumGwa / (float)sumUnit);
			System.out.printf("The GWA is is %.2f\n", sumGwa / (float)sumUnit);

			if(sum / (float)n < 3.0){
				System.out.println("\nSorry you failed\n");
			}
			else{
				System.out.println("\nCongrats you passed!\n");
			}

	}
}
