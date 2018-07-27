import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// There are 3 ways to use regex (regular expressions)
		// in java

		// 1st way
		Pattern p = Pattern.compile(".s"); // . represents a single character
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		System.out.println(b);

		// 2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);

		// 3rd way -- using overloaded matches method
		boolean b3 = Pattern.matches(".s", "as");
		System.out.println(b3);

		System.out.println(Pattern.matches("abc", "abc")); // match against abc
		System.out.println(Pattern.matches("[abc]+", "abc")); // also matches against a or b or c + means 1 or more
		System.out.println(Pattern.matches("\\d", "help"));

		System.out.println();
		System.out.println("Regex method call: ");

		String tester = "Antonella hello@gmail.com is testing yo@yahoo.com stuff 06/04/2018, 1570 Woodward Detroit 48226 (313)555-1212";
		// zip code
		checkRegex("\\d{5}", tester); // matching against a number that has at least 5 digits

		System.out.println();
		System.out.println("Name: ");
		checkRegex("([A-Z])\\w{1,30}",tester);
		
		System.out.println();
		System.out.println("Email: ");
		checkRegex("\\w+@\\w+\\.\\w{2,4}", tester);
		
		System.out.println();
		System.out.println("Date: ");
		checkRegex("\\d{2}.\\d{2}.\\d{4}", tester);

	}

	public static void checkRegex(String regex, String sentence) {

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(sentence);

		// find() - attempts to locate the next subsequence of the input that
		// matches the pattern

		while (m.find()) {
			// group() - returns the actual input subsequence
			if (m.group().length() != 0) {
				System.out.println(m.group().trim());
			}

			System.out.println("Starting index: " + m.start());
			System.out.println("Ending index: " + m.end());
		}

	}

}
