import java.util.Scanner;

public class ValidatorMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// we can use the validator methods by referencing the name of the class the using the . operator
		// because they are all static methods
		// these methods can also be assigned to a variable that matches 
		// the method return type if we need to reference it later
		String name = Validator.getString(scan, "Please enter your name: ");
		
		System.out.println(name);
		
		int userNum = Validator.getInt(scan, "Please enter a whole number: ");
		
		System.out.println(userNum);
		
		int userRange = Validator.getInt(scan, "Please enter a number btwn 1 & 10: ", 1, 10);
		
		System.out.println(userRange);
		
		double userDouble = Validator.getDouble(scan, "Please enter a floating point number: ");
		
		System.out.println(userDouble);
		
		double doubleRange = Validator.getDouble(scan, "Please enter a value btwn 1.5 and 20.25: ", 1.5, 20.25);
		
		System.out.println(doubleRange);

	}

}
