import java.util.Scanner;

/**
 * @author Matthew Verrette				Laba.java
 * 
 * Professor Cross						Introduction to Programming
 *
 * Design and implement an application that reads an arbitrary number 
 * of integers that are in the range 0 to 50 inclusive and counts how 
 * many occurrences of each are entered. After all input has been processed, 
 * print all of the values (with the number of occurrences) that were 
 * entered one or more times.
 *
 */

public class Lab7a {
	
	public static void main(String[] args) {
		// total possible integers 0 - 50
		final int NUMBERS = 51;
		Scanner scan = new Scanner(System.in);
		// Integer array to hold current count
		int[] integers = new int[NUMBERS];
		// current integer entered by user
		int current_integer;
		String user_continue = "y";
		// header
		System.out.println("********************************************************");
		System.out.println("* Enter an Integer and Counts the number of occurances *");
		System.out.println("********************************************************");
		do {
			System.out.print("Enter a number between 0 and 50: ");
			// Attempts to parse line into an Integer
			try {
				current_integer = Integer.parseInt(scan.nextLine());
				// verifies integer is between 0 and 50
				if (current_integer < 0 || current_integer > 50) {
					System.out.println("Invalid Input");
					System.out.println("You must enter an Integer between 0 and 50");
				} else {
					integers[current_integer] = integers[current_integer] + 1;
					System.out.println("Would you like to continue entering Integers");
					System.out.print("y to continue, any other key to quit: ");
					user_continue = scan.nextLine();
				}
			} catch (NumberFormatException nfe) {
				// invalid input, input not an integer
				System.out.println("Invalid input, not an integer");
			}
		} while (user_continue.equalsIgnoreCase("y"));
		System.out.println("*************************************************");
		System.out.println("*                Integer count                  *");
		System.out.println("*************************************************");
		System.out.println("Integer\tCount");
		// prints count for each integer
		for (int i = 0; i <= integers.length - 1; i ++) {
			System.out.println(i + "\t" + integers[i]);
		}
	}
}
