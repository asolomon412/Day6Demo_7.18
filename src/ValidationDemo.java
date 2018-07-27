import java.util.Scanner;

public class ValidationDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		checkForInt(scan);
		checkForInt2(scan);

		scan.close();

	}

	// example 2 validation -- using while loop
	public static void checkForInt2(Scanner scan) {
		
		System.out.println("Please enter a number: ");
		while (!scan.hasNextInt()) {
			
			System.out.println("You need to enter numeric values!");
			scan.nextLine(); // consuming garbage line to discard improper input
			System.out.println("Please enter a number: ");
		}

		int userNum = scan.nextInt();
		System.out.println("You entered: " + userNum);
	}

	public static void checkForInt(Scanner scan) {
		System.out.println("Please enter a whole number: ");

		if (scan.hasNextInt()) { // this is making sure an int is entered into the scanner
			int userNum = scan.nextInt();
			System.out.println(userNum);
		} else {
			System.out.println("You did not enter a valid number!");
		}
	}

}
