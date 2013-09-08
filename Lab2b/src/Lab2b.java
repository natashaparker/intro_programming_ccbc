import java.util.Scanner;

/**
 * 
 */

/**
 * @author Matthew Verrette					Lab2b.java
 * Introduction to Programming				Prof. Cross
 *
 * Prompts the user for a numerator and denominator 
 * of a fractions and displays the decimal equivalent
 * to the user.
 */


public class Lab2b {
	
	// Passed to getInt, allows function to check that
	// denominator is not 0
	
	final static int NUMERATOR = 0;
	final static int DENOMINATOR = 1;

	// Gets user input and verifies that user
	// has entered an integer.
	
	public static int getInt(int type) {	
		int mNumber = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		while (sc.hasNextLine()) {
			if (sc.hasNextInt()) {
				mNumber = sc.nextInt();
				
				// Verifies that denominator is not 0
				// If denominator is 0 result is undefined
				
				if (mNumber == 0 && type == DENOMINATOR) {
					System.out.println("Invalid Input");
					System.out.println("Denominator cannot be 0");
					mNumber = getInt(DENOMINATOR);	
				}
				return mNumber;
			} else {
				System.out.println("Invalid Input");
				mNumber = getInt(type);
				return mNumber;
			}
		}
		return mNumber;
	}
	
	
	/**
	 * @param args
	 */
	
	// Gets two floats from user and divides them.
	// Displays the result in fraction and decimal
	
	public static void main(String[] args) {
		
		int numerator;
		int denominator;
		float result;
		
		System.out.println("Please enter your numerator");
		numerator = getInt(NUMERATOR);
		System.out.println("Please enter your denominator");
		denominator = getInt(DENOMINATOR);
		System.out.println(String.format("fraction: %d / %d  ", numerator, denominator));
		result = (float) numerator / denominator;
		System.out.println(String.format("Decimal: %.2f ", result));

	}

}
