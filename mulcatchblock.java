//Write Java Exception Handling program  using  multiple catch block.

package firstproject;

public class mulcatchblock {

	public static void main(String[] args) {
		        try {
		            int[] array = new int[15];
		            System.out.println(array[20]); // throws ArrayIndexOutOfBoundsException

		            String str = "Prachi Salunkhe";
		            int num = Integer.parseInt(str); // throws NumberFormatException
		        } catch (ArrayIndexOutOfBoundsException P) {
		            System.out.println("ArrayIndexOutOfBoundsException: " + P);
		        } catch (NumberFormatException P) {
		            System.out.println("NumberFormatException: " + P);
		        } catch (Exception P) {
		            System.out.println("Exception: " + P);
		        }
	}

}

/*rrayIndexOutOfBoundsException: java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 15*/