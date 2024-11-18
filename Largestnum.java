package firstproject;
import java.util.Scanner;

public class Largestnum {
                public static void main(String[] args) {
		        // Create Scanner object for user input
		        Scanner sc = new Scanner(System.in);

		        // Declare variables for three numbers
		        int x, y, z;
                //Enter first no.
		        System.out.print("Enter the first number=");
		        x = sc.nextInt();
		       //Enter second no.
		        System.out.print("Enter the second number=");
		        y = sc.nextInt();
		      //Enter third no.
		        System.out.print("Enter the third number=");
		        z = sc.nextInt();

		        // Find and display the largest number
		        if (x >= y && x >= z) {
		            // x is the largest
		            System.out.println("Largest number: " + x);
		        } else if (y >= x && y >= z) {
		            // y is the largest
		            System.out.println("Largest number: " + y);
		        } else {
		            // z is the largest
		            System.out.println("Largest number: " + z);
		        }
		        sc.close();
	}

}
