package firstproject;

public class swapthreevariable {
public static void main(String[] args) {
	        // Initialize variables
	        int a = 1; // First number
	        int b = 4; // Second number
	        int c = 9; // Third number

	        // Display values before swapping
	        System.out.println("Before Swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	        System.out.println("c = " + c);

	        // Swap values using temporary variable
	        int temp; // Temporary variable for swapping

	        // Swap a and b
	        System.out.println("\nSwapping a and b");
	        temp = a; // Store a in temp
	        a = b; // Assign b to a
	        b = temp; // Assign temp (original a) to b

	        // Swap b and c
	        System.out.println("\nSwapping b and c");
	        temp = b; // Store b (new value) in temp
	        b = c; // Assign c to b
	        c = temp; // Assign temp (original b) to c

	        // Display swapped values
	        System.out.println("\nAfter Swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	        System.out.println("c = " + c);
	}

}
