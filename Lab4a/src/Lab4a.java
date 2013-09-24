import java.util.Scanner;

/**
 * @author Matthew Verrette				Lab4a.java
 * 
 * Professor Cross						Introduction to Programming
 *
 * Prompts the user for a string and prints each character on a new
 * line
 * 
 */

public class Lab4a {

	public static void main(String[] args) {
		String my_string;
		String response;
		
		System.out.println("Prints each character of a string" +
				" on a new line");
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

		// Prints each character of string on a new line
		
		for (int i = 0; i < my_string.length(); i++ ) {
			System.out.println(my_string.charAt(i));
		}
	}

}
