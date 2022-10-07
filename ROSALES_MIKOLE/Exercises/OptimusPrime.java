// Optimus Prime is my idol, and I dream to be just like him. To achieve my dream, the first requirement is to be a PRIME number. Can you help me check if I'm a PRIME number or NOT?



// A Number is said to be a PRIME number if it only have 2 factors which is 1 and itself. The number 1 is neither a PRIME or COMPOSITE number.

import java.util.Scanner;

public class OptimusPrime{
    public static void main(String args[]){
        checkPrime();
    }
    public static void checkPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number: ");
        int num = sc.nextInt();
        boolean flag = false;

        for(int i = 2; i <= num / 2; ++i){
            if(num % i == 0){
                flag = true;
                break;
            }
        }
        if(num == 1){
            System.out.print("I'm born to be an extra");
        }
        else if(!flag)
            System.out.print("I am Optimus Prime");
        else
            System.out.print("Shall I be Megatron then?");
    }
}