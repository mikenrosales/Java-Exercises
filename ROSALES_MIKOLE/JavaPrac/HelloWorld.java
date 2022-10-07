public class GradedExerciseW1{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int units, float addFee, float totalFee;
		System.out.println("Enter the number of units");// user input
		units = input.nextInt();
		addFee = units * 0.15;
		totalFee = addFee + 200; // additional fee with misc fee of 200
		System.out.println("You enrolled "+units+" and your total fee with the addtional fee and miscellaneous fee is "+totalFee);
	}
}