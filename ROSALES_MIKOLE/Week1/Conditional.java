import java.util.*;

public class Conditional{
	public static void main(String[] args) {
		
		Scanner type = new Scanner(System.in);
		Scanner price = new Scanner(System.in);
		System.out.print("Enter the TYPE of appliance sold (1-4): ");
		int typeApp = type.nextInt();
		System.out.print("Enter the PRICE of the appliance: ");
		int priceApp = price.nextInt();

		double comm;
		switch(typeApp){
			case 1: //7% of the sale or 400 // more
					comm = priceApp * 0.07;
					if(comm>400){
						System.out.println("\nCommission is "+comm+"\n");
					}
					else{
						System.out.println("\nCommission is 400\n");
					}
					break;

			case 2: //10% of the sale or 900// less
					comm = priceApp * 0.1;
					if(comm<900){
						System.out.println("\nCommission is "+comm+"\n");
					}
					else{
						System.out.println("\nCommission is 900\n");
					}
					break;

			case 3: //12% of the sale
					comm = priceApp * 0.12;
					System.out.println("\nCommission is "+comm+"\n");
					break;

			case 4: //250
					System.out.println("\nCommission is 250\n");
					break;

			default:
					System.out.println("Enter a valid type 1-4\n");			
		}
	}
}