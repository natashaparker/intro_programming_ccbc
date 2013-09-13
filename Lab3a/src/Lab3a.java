import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Matthew Verrette						Lab3a.java
 * Professor Cross								Introduction to Programming
 * 
 * Get first and last name from standard input and generates a username 
 * 
 */
public class Lab3a {

	public static void main(String[] args) {
		
		String firstName;
		String lastName;
		String username;
		int randInt;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\tGenerate Username");
		System.out.println("***************************");
		System.out.print("Enter First Name: ");
		firstName = scan.nextLine();
		System.out.print("Enter Last Name: ");
		lastName = scan.nextLine();
		Random rand = new Random();
		
		// Adds Random numbers to Last Name if last name is 
		// Less than 5 concatenate random integer
		if (lastName.length() < 5) {
			int needs = 5 - lastName.length();
			for ( int i = 0; i <= needs; i++) {
				lastName = lastName + rand.nextInt(10);
			}
		}
		
		randInt = rand.nextInt(90) + 11;
		
		username = firstName.charAt(0) + lastName.substring(0,5) + randInt;
		
		System.out.println("***************************");
		System.out.println("Generated Username: " + username.toLowerCase());
		
	}

}
