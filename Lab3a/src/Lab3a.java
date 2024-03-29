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
		
		String f_name;
		String l_name;
		String u_name;
		int r_int;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\tGenerate Username");
		System.out.println("********************************");
		System.out.print("Enter First Name: ");
		f_name = scan.nextLine();
		System.out.print("Enter Last Name: ");
		l_name = scan.nextLine();
		Random rand = new Random();
		
		// Concatenates random integers to l_name if l_name is 
		// less than 5 characters long
		if (l_name.length() < 5) {
			int needed_char = 5 - l_name.length();
			for ( int i = 0; i <= needed_char; i++) {
				l_name = l_name + rand.nextInt(10);
			}
		}
		
		r_int = rand.nextInt(90) + 11;
		u_name = f_name.charAt(0) + l_name.substring(0,5) + r_int;

		System.out.println("***************************");
		System.out.println("Generated Username: " + u_name.toLowerCase());
		
	}

}
