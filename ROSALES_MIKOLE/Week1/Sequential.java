import java.util.*;

public class Sequential{
	public static void main(String[] args) {
		Scanner unitInput = new Scanner (System.in);
		System.out.print("Enter the number of units: ");

		int units = unitInput.nextInt();// user input
		double unitPrice = units * 45;
		double addFee = (unitPrice * 0.15) + unitPrice;
		double totalFee = addFee + 200; // additional fee with misc fee of 200

		System.out.println("\nYou enrolled "+units+" Units\nTUITION FEE (addtional fee and miscellaneous fee included) is >>> "+totalFee+"\n");

	}
}