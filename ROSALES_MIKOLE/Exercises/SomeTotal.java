// Ever since I won the lottery, I’ve got so many stacks of cash that I don’t think I can count them by hand anymore! You know, not to brag or anything, but I’m going to need some help with the counting of my huge wads of cash. Since I’m rich now, I just figured I’d pay you to make a program that could count it for me. Chop chop now!

// Input

// 1. Number of cash

// Constraints

// The value is >= 1.

// 2. Values of each of the cash

// Output

// The first line will contain a message prompt to input the number of cash.
// The succeeding lines will prompt for the values of each of the cash.
// The last line contains the sum total of all the cash values.

import java.util.Scanner;
import java.util.Arrays;

public class SomeTotal{
    public static void main(String args[]){
        searchValue();
    }
    
    public static void searchValue(){
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.print("Enter the number of cash: ");
        int num = sc.nextInt();
        int[] val = new int[num];

        for(int i = 0; i < num; i++){
            val[i] = sc.nextInt();
        }
        System.out.println("\nTotal: ");
        sumTotal(val);
    }
    public static void sumTotal(int val[]){
        int sum = 0; 

        for (int i = 0; i < val.length; i++){
            sum += val[i];
        }
        String num = Arrays.toString(val);
        String removeComma = num.replace(",", " +");
        String removeBracket = removeComma.replaceAll("\\[", "").replaceAll("\\]", "");

        System.out.print(removeBracket);
        System.out.print(" = "+sum);
    } 
}