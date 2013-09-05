import java.util.Scanner;

/**
 * 
 */

/**
 * @author developer
 *
 */
public class Lab2b {
	
	final static int NUMERATOR = 0;
	final static int DENOMINATOR = 1;

	public static int getInt(int type) {	
		int mNumber = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		while (sc.hasNextLine()) {
			if (sc.hasNextInt()) {
				mNumber = sc.nextInt();
				if (mNumber == 0 && type == DENOMINATOR) {
					System.out.println("Invalid Input");
					mNumber = getInt(DENOMINATOR);
					return mNumber;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
