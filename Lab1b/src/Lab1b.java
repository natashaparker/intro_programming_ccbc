import java.util.Scanner;

/**
 * 
 */

/**
 * @author Matthew Verrette
 *
 */
public class Lab1b {

	/**
	 * @param args
	 */
	

	private static String getName(Scanner scanner) {
		System.out.println("Hello, What is your name");
		String mName = scanner.nextLine();
		if (mName.length() < 1 || mName.length() > 32 ) {
			System.out.println("Invalid Input");
			getName(scanner);
		}
		return mName;
	}
	
	private static String getBirthday(Scanner scanner) {
		System.out.println("When is your birthday?");
		String mBirthday = scanner.nextLine();
		if (mBirthday.length() < 4 || mBirthday.length() > 32) {
			System.out.println("Invalid Input");
			getBirthday(scanner);
		}
		return mBirthday;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		String name;
		String birthday;
		String hobby;
		String book;
		String movie;
		
		name = getName(sc);
		birthday = getBirthday(sc);
		
		
		System.out.println("What are your hobbies?");
		hobby = sc.nextLine();
		
		System.out.println("What is your favorite book?");
		book = sc.nextLine();
		
		System.out.println("What is your favorite movie?");
		movie = sc.nextLine();
		
		System.out.println(String.format("Name: %s", name));
		System.out.println(String.format("Birthday: %s", birthday));
		System.out.println(String.format("Hobbies: %s", hobby));
		System.out.println(String.format("Favorite Book: %s", book));
		System.out.println(String.format("Favorite Movie: %s", movie));

	}

}
