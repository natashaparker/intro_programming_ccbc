import java.util.Scanner;

/**
 * @author Matthew Verrette				Lab4b.java
 * 
 * Professor Cross						Introduction to Programming
 *
 * Prompts the user a string, counts the vowels and prints the counts
 * for the user
 * 
 */

public class Lab4b {
	
	// Checks if a vowel count is equal to one prints proper sentence structure
	
	public static void printLetterCount(char letter, int count) {	
		if (count == 1) {
			System.out.println(String.format("There is one %c", letter));
		} else {
			System.out.println(String.format("There are %d %c's", count, letter));
		}

	}

	public static void main(String[] args) {
		
		String my_string;
		String response;
		int cnt_a = 0;
		int cnt_e = 0;
		int cnt_i = 0;
		int cnt_o = 0;
		int cnt_u = 0;
		int cnt_non_vowel = 0;
		
		System.out.println("Counts vowels and non-vowels from a string");
		System.out.println("*********************************"
				+ "*******************");
		
		Scanner scan = new Scanner(System.in);
		
		// Gets and verifies user input 
		
		do {
			System.out.print("Please enter a string: ");
			my_string = scan.nextLine();
			System.out.println("You entered the following String:");
			System.out.println(my_string);
			do {
				System.out.print("Is this correct? (y/n) : ");
				response = scan.nextLine();
				if (response.toLowerCase().equals("n")) {
					my_string = "";
				} else if (response.toLowerCase().equals("y")) {
					
				} else {
					response = "";
				}
			} while (response.length() == 0);
		} while (my_string.length() == 0);

		// Counts vowles and other characters
		
		for (int i = 0; i < my_string.length(); i++ ) {
			switch(my_string.charAt(i)) {
				case 'a':
					cnt_a++;
					break;
				case 'e':
					cnt_e++;
					break;
				case 'i':
					cnt_i++;
					break;
				case 'o':
					cnt_o++;
					break;
				case 'u':
					cnt_u++;
					break;
				default:
					if (my_string.charAt(i) != ' ') {
						cnt_non_vowel++;
					}
					break;
			}
		}
		
		printLetterCount('a', cnt_a);
		printLetterCount('e', cnt_e);
		printLetterCount('i', cnt_i);
		printLetterCount('o', cnt_o);
		printLetterCount('u', cnt_u);
		System.out.println(String.format(
				"There are %d non-vowel characters", cnt_non_vowel));

	}
	
}
