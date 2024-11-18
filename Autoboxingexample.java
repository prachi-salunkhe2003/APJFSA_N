package firstproject;

public class Autoboxingexample {

	public static void main(String[] args) {
		        // Primitive char variable (first letter of name)
		        char firstNameInitial = 'p';

		        // Autoboxing: converting primitive char to Character object
		        Character autoboxedCharacter = firstNameInitial;
		        System.out.println("Autoboxed Character: " + autoboxedCharacter);

		        // Primitive boolean variable (whether the person is a student)
		        boolean isStudent = true;

		        // Autoboxing: converting primitive boolean to Boolean object
		        Boolean autoboxedBoolean = isStudent;
		        System.out.println("Autoboxed Boolean: " + autoboxedBoolean);

		        // Primitive int variable (age)
		        int age = 25;

		        // Autoboxing: converting primitive int to Integer object
		        Integer autoboxedInteger = age;
		        System.out.println("Autoboxed Integer: " + autoboxedInteger);

	}

}

/*Autoboxed Character: p
Autoboxed Boolean: true
Autoboxed Integer: 25
*/