package firstproject;
import java.util.Scanner;

public class Oddevennumber {
	       public static void main(String[] args) {
	        // Create a Scanner object to read from the console
	        Scanner sc = new Scanner(System.in);

	        // enter a number
	        System.out.print("Enter a number: "); // Changed to print for better formatting

	        // Store user input in the 'number' variable
	        int number = sc.nextInt();

	        // Use conditional operator to check if number is odd (number % 2 != 0)
	        // If true, assign "Odd" to 'result'; otherwise, assign "Even"
	        String result = (number % 2 != 0) ? "Odd" : "Even";

	        // Print number and its even or odd
	        System.out.println(number + " is " + result);

	        // Close the scanner to prevent resource leaks
	        sc.close();
	}

}
