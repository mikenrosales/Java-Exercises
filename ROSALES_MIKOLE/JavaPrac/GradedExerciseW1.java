import java.util.*;

public class GradedExerciseW1{
	public static void main(String[] args) {
		Scanner unitInput = new Scanner (System.in);
		System.out.println("Enter the number of units");
		int units = unitInput.nextInt();// user input
		double unitPrice = units * 45;
		double addFee = (unitPrice * 0.15) + unitPrice;
		double totalFee = addFee + 200; // additional fee with misc fee of 200
		System.out.println("You enrolled "+units+" Units and your TUITION FEE (addtional fee and miscellaneous fee included) is "+totalFee);

		Scanner type = new Scanner(System.in);
		Scanner price = new Scanner(System.in);
		System.out.println("\nEnter the TYPE of appliance sold");
		int typeApp = type.nextInt();
		System.out.println("Enter the PRICE of the appliance");
		int priceApp = price.nextInt();

		double comm;
		switch(typeApp){
			case 1: //7% of the sale or 400
					comm = priceApp * 0.07;
					if(comm>400){
						System.out.println("Commission is "+comm);
					}
					else{
						System.out.println("Commission is 400");
					}

			case 2: //10% of the sale or 900
					comm = priceApp * 0.1;
					if(comm<900){
						System.out.println("Commission is "+comm);
					}
					else{
						System.out.println("Commission is 900");
					}

			case 3: //12% of the sale
					comm = priceApp * 0.12;
					System.out.println("Commission is "+comm);
					break;

			case 4: //250
					System.out.println("Commission is 250");
					break;

			default:
					System.out.println("Enter a valid type 1-4");
					
		}
	}
}