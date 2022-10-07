// Write a C program that will search a value in the array.

// Input

// 1. n

// Description

// number of elements to be stored in the array

// 2. num

// Description

// values to be stored in the array

// 3. x

// Description

// value to be searched in the array

import java.util.Scanner;

public class ElementSearch{
    public static void main(String args[]){
        searchValue();
    }
    public static void searchValue(){
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.print("Enter number of elements: ");
        int num = sc.nextInt();
        int[] val = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("Integer #"+(i+1)+": ");
            val[i] = sc.nextInt();
        }
        System.out.print("Elements of Array: ");
        for (int element: val) {
            System.out.print(element+" ");
        }
        System.out.print("\nElement to search in the array: ");
        int search = sc.nextInt();
        for(int i = 0;i < num; i++){
        	if(val[i]==search){
                System.out.println("Found!");
            	flag=1;
            	break;
        	}
    	}
    		if(flag==0){
        		System.out.println("Not found!");
    		}
    }
}