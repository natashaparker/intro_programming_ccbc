import java.util.Scanner;

/**
 * @author Matthew Verrette					Lab2a.java
 * Introduction to Programming				Prof. Cross
 *
 * reads two floating point numbers from user,
 * calculates their sums, differences, and products
 * and displays the results to the user 
 */
public class Lab2a {

	/**
	 * @param args
	 */
	
	
	// Gets user input and verifies that it is valid.
	// Valid input is a float
	
	public static float getFloat() {	
		float mNumber = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		while (sc.hasNextLine()) {
			if (sc.hasNextFloat()) {
				mNumber = sc.nextFloat();
				return mNumber;
			} else {
				System.out.println("Invalid Input");
				mNumber = getFloat();
				return mNumber;
			}
		}
		return mNumber;
	}
	
	// Gets two floats and displays arithmetic operations
	
	public static void main(String[] args) {
		
		float firstFloat;
		float secondFloat;
		
		firstFloat = getFloat();
		secondFloat = getFloat();
		
		System.out.println(String.format("Addition: %.2f + %.2f = %.2f ", firstFloat, secondFloat, 
				firstFloat + secondFloat));
		
		System.out.println(String.format("Subtraction: %.2f - %.2f = %.2f ", firstFloat, secondFloat, 
				firstFloat - secondFloat));
		
		System.out.println(String.format("Multiplication: %.2f * %.2f = %.2f ", firstFloat, secondFloat, 
				firstFloat * secondFloat));
		
		// Verifies that Denominator isn't 0. This results in an undefined answer and is invalid.
		
		if (secondFloat == 0) {
			System.out.println("Division: Denominator Can't be 0, result undefined");
		} else {
			System.out.println(String.format("Division: %.2f / %.2f = %.2f ", firstFloat, secondFloat, 
				firstFloat / secondFloat));
		}
	}

}
