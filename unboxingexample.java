package firstproject;

public class unboxingexample
{

	public static void main(String[] args)
	{
		        // Object wrapper classes
		        Character firstNameInitial = 'J';
		        Boolean isStudent = true;
		        Integer age = 25;

		        // Unboxing: converting object wrapper classes to primitive types
		        char primitiveChar = firstNameInitial;
		        boolean primitiveBoolean = isStudent;
		        int primitiveInt = age;

		        // Printing the unboxed values
		        System.out.println("Unboxed Character: " + primitiveChar);
		        System.out.println("Unboxed Boolean: " + primitiveBoolean);
		        System.out.println("Unboxed Integer: " + primitiveInt);
	}
}

/*Unboxed Character: J
Unboxed Boolean: true
Unboxed Integer: 25
*/