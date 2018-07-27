import java.util.Scanner;

/*
 * Given a string and a non-negative int n, 
 * return a larger string that is n copies of the original string.
 * Add validation using a try/catch, scanner validation methods,
 * or a validation mechanism to make sure that the word entered is 
 * longer than 1 character 
 * --- if you are creating your own validation methods please add them to the
 * Validator.java file to use/call them
 * 
 */
public class CodeChallengeDay6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = Validator.getString(scan, "Please enter a word: ");
		
		int userNum = Validator.getInt(scan, "Please enter a whole number: ");
		
		String results = stringTimes(word, userNum);
		System.out.println(results);
		
		scan.close();

	}

	public static String stringTimes(String str, int n) {
		String result = "";

		for (int i = 0; i < n; i++) {
			result += str; // could also have used result = result + str;
		}
		return result;
	}
}
