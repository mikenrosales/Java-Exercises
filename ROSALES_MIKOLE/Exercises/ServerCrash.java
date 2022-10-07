// I work as a teacher in one of the more technologically advanced schools in the country. So we usually store our information in a server for easy access. However, after inputting the scores of my students in the server, there was an error that combined all of the student’s scores into one large number! I need to know how many got a certain score y based on the large number n by tomorrow or else I’ll lose my job! Help!

// Input

// 1. The large number

// Constraints

// The value is within the range: 0 <= n <= 2,147,483,647

// 2. The value of y

// Constraints

// The value is within the range: 0 <= y <= 9

// Output

// The first line will contain a message prompt to input the large number.
// The second line will contain a message prompt to input the value of y.
// The last line contains the number of occurrences of y in the digits of the large number.

import java.util.Scanner;

public class ServerCrash{
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the large number: ");
    int n = sc.nextInt();
    System.out.print("Enter y: ");
    int y = sc.nextInt();
    occurrence(n, y);
	}

	public static void occurrence(int n, int y){
		if(n < Integer.MAX_VALUE || n > 0 && y > 0 || y < 9){
			String num = String.valueOf(n);
			String[] arr = num.split("");

			int count = 0;
			for(int i = 0; i < arr.length; i++){
				if(String.valueOf(y).equals(arr[i])){
					count++;
				}
			}
			System.out.println("Occurrences of y = "+count);
		} else {
			System.out.println("Values beyond constraints");
		}
	}
}