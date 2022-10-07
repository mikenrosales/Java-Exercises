// Good day! This is John from Globe Telecom Inc. and we would like to avail of your services. We have been putting up cell towers left and right but the signal can’t seem to reach everyone in the area. I fear this is because we have miscalculated whether or not the signal (circles) of two cell towers intersect with each other. We will give you the coordinates of the cell towers as soon as possible. 

// Best regards,

// John



// Hint: Use the distance formula.

// d = sqrt((x2 - x1)2 + (y2 - y1)2)

// Input

// 1. The x, y coordinates of the first circle

// 2. The radius of the first circle

// 3. The x, y coordinates of the second circle

// 4. The radius of the second circle

// Output

// The first line will contain a message prompt to input the x, y coordinates of the first circle.
// The second line will contain a message prompt to input the radius of the first circle.
// The third line will contain a message prompt to input the x, y coordinates of the second circle.
// The fourth line will contain a message prompt to input the radius of the second circle.
// The last line contains "YES" if the two circles intersect with each other and "NO" if they don't.

import java.util.Scanner;

public class SignalCoverage{
    public static void main(String args[]){
        SignalCoverage();
    }
    public static void SignalCoverage(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x, y of the first circle: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter the radius of the first circle: ");
        int r1 = sc.nextInt();
        
        System.out.print("Enter the x, y of the second circle: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.print("Enter the radius of the second circle: ");
        int r2 = sc.nextInt();

        double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
 
        if (d <= r1 - r2) {
            System.out.println("YES");
        }
        else if (d <= r2 - r1) {
            System.out.println("YES");
        }
        else if (d < r1 + r2) {
            System.out.println("YES");
        }
        else if (d == r1 + r2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}