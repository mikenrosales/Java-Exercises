import java.util.*;

public class Array{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double data[] = new double[10];// preallocated size, can be declared for user input
		
		int peopleCtr = 0;
		double totalPay = 0;

		// user input
        for (int i = 0 ; i < data.length; i++ ) {
        	System.out.print("Enter worker ["+i+"] sales: ");
           	data[i] = input.nextDouble();
          	totalPay = 200 + (data[i] * 0.09);
           	if(totalPay > 500){
				peopleCtr++;
			}
        }
		System.out.println("\n=========================================");
		// salary display
        for (int i = 0 ; i < data.length; i++ ) {
        	totalPay = 200 + (data[i] * 0.09);
    		// System.out.println("Worker "+i+" earned "+totalPay);
          	System.out.printf("\nWorker ["+i+ "] earned %.2f",totalPay);
        	}
       		System.out.println("\n\nThe number of people having a salary greater than 500 is "+peopleCtr+"\n");

	}
}