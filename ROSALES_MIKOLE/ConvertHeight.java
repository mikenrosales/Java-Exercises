import java.util.*;
public class ConvertHeight  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ft = sc.nextInt();
        int in = sc.nextInt();
        double cm = (ft + in/12.0) / 0.0328084;
		
 
        System.out.printf("%d feet and %d inches is %.2f in centimetre.", ft, in, cm);
    
    }
}


public  void create(int array[], int n){
	int i;
	array = new int[n];
	for(i = 0; i < n; i++){
		array[i] = 0;
		System.out.println(array[i]);
	}
}
        


public void unique(int array[ ], int input[ ]) { // cymer
        boolean isUnique;
        int ctr = 0;
        for(int i = 0; i < input.length; i++) {
            isUnique = true;
            for(int n : array) {
                if(n == input[i]) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) {
                array[ctr] = input[i];
                ctr++;
            }
        }
 
        for(int n : array) {
 
            System.out.println(n);
        }
    } 	


 public void unique(int array[ ], int input[ ]){ // mansueto
        int ctr = 0;
        for(int i = 0; i < input.length; i++){
            if(!contains(array, input[i])){
                array[ctr] = input[i];
                ctr++;
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
 
    public boolean contains(int array[ ], int item){
        for(int i = 0; i < array.length; i++){
                if(array[i] == item){
                    return true;
                }
        }
        return false;
    }



// import java.util.*; // Coral
// public class CsCard{
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		double preBal = sc.nextDouble();
// 		double addCharge = sc.nextDouble();
// 		double interest = 0;
// 		if(preBal > 0)
// 			interest = (preBal+addCharge) * 0.02;

// 		double newBal = preBal+addCharge+interest;
// 		double payment = 0;
// 		if(newBal < 50)
// 			payment = newBal;
// 		else if(newBal >= 50 && newBal <=300)
// 			payment = 50;
// 		else if(newBal > 300)
// 			payment = newBal * 0.2;
// 		System.out.printf("Previous Balance: $%.2f\n", preBal);
// 		System.out.printf("Additional Charges: $%.2f\n", addCharge);
// 		System.out.printf("Interest: $%.2f\n\n", interest);
// 		System.out.printf("New Balance: $%.2f\n\n", newBal);
// 		System.out.printf("Minimum Payment: $%.2f\n", payment);
// 	}
// }



import java.util.*; // mansueto
 
public class ConvertHeight{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        double prevBalance = sc.nextDouble();
        double addCharges = sc.nextDouble();
        double totalBalance = prevBalance + addCharges;
 
        double interest = 0;
        if(prevBalance > 0){
            interest = totalBalance * 0.02;
        }
        totalBalance += interest;
 
        double minimumPayment = totalBalance;
 
        if(totalBalance >= 50 && totalBalance <= 300)
            minimumPayment = 50;
        else if(totalBalance > 300)
            minimumPayment = totalBalance * 0.2;
 
        System.out.printf("Previous Balance: $%.2f\n",prevBalance);
        System.out.printf("Additional Charges: $%.2f\n",addCharges);
        System.out.printf("Interest: $%.2f\n\n",interest);
 
        System.out.printf("New Balance: $%.2f\n\n",totalBalance);
        System.out.printf("Minimum Payment: $%.2f\n",minimumPayment);
    }
 
 
}





