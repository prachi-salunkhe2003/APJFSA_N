//Write Java Exception Handling program  using finally block.

package firstproject;
//Main class containing the main method
public class finallyblock {
	// Main method where program execution begins
	public static void main(String[] args) {
		
		        // Try block to enclose code that may throw an exception
		        try {
		            // Print a message indicating the start of the try block
		            System.out.println("in try");
		        }
		        // Finally block to enclose code that must be executed regardless of exceptions
		        finally {
		            // Print a message indicating the start of the finally block
		            System.out.println("in finally");
		        }
		        // Print a message after the try-catch-finally block
		        System.out.println("after try catch finally");
		    }
		}


	/*in try
in finally
after try catch finally
*/