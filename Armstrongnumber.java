package firstproject;

import java.util.Scanner;

public class Armstrongnumber {

public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // enter a number
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        
		        int originalNumber = num;
		        int remainder;
		        int result = 0;
		        int numberOfDigits = String.valueOf(num).length(); // Count the number of digits

		        // Check if the number is an Armstrong number
		        while (originalNumber != 0) {
		            remainder = originalNumber % 10;
		            result += Math.pow(remainder, numberOfDigits); 
		            originalNumber /= 10;
		        }

		        if (result == num)
		            System.out.println(num + " is an Armstrong number.");
		        else
		            System.out.println(num + " is not an Armstrong number.");

		        sc.close(); 
		    }
		}
