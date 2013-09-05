import java.util.Scanner;

/**
 * 
 */

/**
 * @author developer
 *
 */
public class Lab2a {

	/**
	 * @param args
	 */
	
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
		
		// Verifies that Denominator isn't 0. This results in an undefined answer.
		
		if (secondFloat == 0) {
			System.out.println("Division: Denominator Can't be 0, result undefined");
		} else {
			System.out.println(String.format("Division: %.2f / %.2f = %.2f ", firstFloat, secondFloat, 
				firstFloat / secondFloat));
		}
	}

}
