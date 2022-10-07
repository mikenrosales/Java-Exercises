import java.util.*;

public class Practice{
	// Access Modifiers
	public String gender = "Male";
	private String myName = "Mikole Rosales";
	protected int age = 22;

	// Main and other methods
	public static void main(String[] args){
		// ScannerTypes();
		// SumNum();
		// QuoNum();
		// MulTable();
		// isPalindrome();
		// gameCounter();
		// ArrayAscendingOrder();
	}

	public static void ScannerTypes(){
		System.out.println("Input / Scanner");
		// Scanner declaration
		Scanner sc = new Scanner(System.in);

		// String input
		String str = sc.nextLine();

		// int input
		int wnum = sc.nextInt();

		// double input
		double dec = sc.nextDouble();
		
		// Output
		System.out.println(str);
		System.out.println(wnum);
		System.out.println(dec);
	}

	public static void SumNum(){
		System.out.println("Sum of two numbers");
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int sum = num1 + num2;

		System.out.println("Sum is "+sum);
	}

	public static void QuoNum(){
		System.out.println("Quotient of two numbers");
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int quo = num1 / num2;

		System.out.println("Quotient is "+quo);
	}

	public static void MulTable(){
		System.out.println("Multiplication table of a number (up to x10)");
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for(int i=1; i<11; i++){
			System.out.println(x+" x "+ i +" = "+x * i);
		}
	}

	public static void isPalindrome(){
		System.out.println("Determine if string is Palindrome or not\n");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String:");
		String str = sc.nextLine();
		// containers
		String orgStr = str.toLowerCase();
		String rev = "";

		// get the length of the string
		int len = orgStr.length();

		// reverse a string
		for(int i = len - 1; i>=0; i--){
			rev = rev + orgStr.charAt(i);
		}

		// print reverse string
		// System.out.println(rev);

		// compare condition
		if(orgStr.equals(rev)){
			System.out.println(orgStr + " is a Palindrome");
		}
		else{
			System.out.println(orgStr + " is a not Palindrome");
		}
	}

	public static void gameCounter(){
		System.out.println("Score counter for each team\n");
		Scanner sc = new Scanner(System.in);

		int targetPts = 100;
		int team1Ctr = 0;
		int team2Ctr = 0;

		// System.out.println("Score counter for each team\n");
		for(int i = 0; i<=100; i++){
			int score = sc.nextInt();
			if (score == 1) {
				team1Ctr++;
			}
			if (score == 2) {
				team2Ctr++;
			}
			if (score == 0) {
				break;
			}
		}

		if (team1Ctr == team2Ctr) {
			System.out.println("Tied! with a score of "+ team1Ctr +" and "+ team2Ctr);
		}
		if (team1Ctr > team2Ctr) {
			System.out.println("Team 1 won with a score of "+team1Ctr);
		}
		if (team1Ctr < team2Ctr) {
			System.out.println("Team 2 won with a score of "+team2Ctr);
		}
	}

	public static void ArrayAscendingOrder(){
		int count, temp;
    	
    	//User inputs the array size
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number of elements you want in the array: ");
        // count = scan.nextInt();
        count = 3;
    
        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
            	// change condition vice versa
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);
	}
}