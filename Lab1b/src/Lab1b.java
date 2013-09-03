import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Matthew Verrette
 * 		   Introduction to Programming
 *         Professor Cross
 *
 * Program Output:
 * java -jar Lab1b.jar 
 * 
 *	*** About Me ***
 *		Name: Matthew Verrette
 *		Birthday: February 24, 1981
 *		Hobbies: Motorcycles, Art, Computers
 *		Favorite Book: The Girl with the Dragon Tattoo
 *		Favorite Movie: Blade Runner
 *		
 *		Tell me about you...
 *		
 *		Hello, What is your name: Matthew Verrette
 *		When is your birthday?: February 24, 1981
 *		What are your hobbies?: Motorcycles, Art, Computers
 *		What is your favorite book?: Girl with the Dragon Tattoo
 *		What is your favorite movie?: Blade Runner
 *		
 *		*** About You ***
 *		Name: Matthew Verrette
 *		Birthday: February 24, 1981
 *		Hobbies: Motorcycles, Art, Computers
 *		Favorite Book: Girl with the Dragon Tattoo
 *		Favorite Movie: Blade Runner
 *
 *
 */

public class Lab1b {
	
	//-------------------------------------------------------
	//  Gets users Name, checks that the User
	//  doesn't pass no data or too much data
	// returns name as String
	//-------------------------------------------------------

	private static String getName(Scanner scanner) {
		System.out.print("Hello, What is your name: ");
		String mName = scanner.nextLine();
		if (mName.length() < 1 || mName.length() > 32 ) {
			System.out.println("Invalid Input");
			mName = getName(scanner);
			return mName;
		} else {
			return mName;
		}
	}
	
	//-------------------------------------------------------
	//  Gets users Birthday, checks that the User
	//  doesn't pass no data or too much data
	//  returns birthday as String
	//-------------------------------------------------------
	
	private static String getBirthday(Scanner scanner) {
		System.out.print("When is your birthday?: ");
		String mBirthday = scanner.nextLine();
		if (mBirthday.length() < 1 || mBirthday.length() > 64) {
			System.out.println("Invalid Input");
			mBirthday = getBirthday(scanner);
			return mBirthday;
		} else {
			return mBirthday;
		}
	}
	
	//-------------------------------------------------------
	//  Gets users Hobbies, checks that the User
	//  doesn't pass no data or too much data
	//  returns hobbies as String
	//-------------------------------------------------------
	
	private static String getHobby(Scanner scanner) {
		System.out.print("What are your hobbies?: ");
		String mHobby = scanner.nextLine();
		if (mHobby.length() < 1 || mHobby.length() > 256) {
			System.out.println("Invalid Input");
			mHobby = getHobby(scanner);
			return mHobby;
		} else {
			return mHobby;
		}
	}
	
	//-------------------------------------------------------
	//  Gets users favorite Book, checks that the User
	//  doesn't pass no data or too much data
	//  returns Book as String
	//-------------------------------------------------------
	
	private static String getBook(Scanner scanner) {
		System.out.print("What is your favorite book?: ");
		String mBook = scanner.nextLine();
		if (mBook.length() < 1 || mBook.length() > 256) {
			System.out.println("Invalid Input");
			mBook = getBook(scanner);
			return mBook;
		} else { 
			return mBook;
		}
	}
	
	//-------------------------------------------------------
	//  Gets users favorite Movie, checks that the User
	//  doesn't pass no data or too much data
	//  returns Movie as String
	//-------------------------------------------------------
	
	private static String getMovie(Scanner scanner) {
		System.out.print("What is your favorite movie?: ");
		String mMovie = scanner.nextLine();
		if (mMovie.length() < 1 || mMovie.length() > 256) {
			System.out.println("Invalid Input");
			mMovie = getMovie(scanner);
			return mMovie;
		} else {
			return mMovie;
		}
	}
	
	//-------------------------------------------------------
	//  Prints and Labels Users information on separate lines
	//-------------------------------------------------------
	
	private static void printResults(HashMap <String, String> map) {
		System.out.println();
		System.out.println("*** About You ***");
		System.out.println(String.format("Name: %s", map.get("Name")));
		System.out.println(String.format("Birthday: %s", map.get("Birthday")));
		System.out.println(String.format("Hobbies: %s", map.get("Hobby")));
		System.out.println(String.format("Favorite Book: %s", map.get("Book")));
		System.out.println(String.format("Favorite Movie: %s", map.get("Movie")));
	}
	
	private static void printAuthor() {
		System.out.println();
		System.out.println("*** About Me ***");
		System.out.println("Name: Matthew Verrette");
		System.out.println("Birthday: February 24, 1981");
		System.out.println("Hobbies: Motorcycles, Art, Computers");
		System.out.println("Favorite Book: The Girl with the Dragon Tattoo");
		System.out.println("Favorite Movie: Blade Runner");
	}
	
	//-------------------------------------------------------
	//  Main Method, stores user information as Map
	//  pass Map to print method
	//-------------------------------------------------------
	
	public static void main(String[] args) {
		
		printAuthor();
		System.out.println();
		System.out.println("Tell me about you...");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		HashMap <String, String> personMap = new HashMap <String, String>();
		personMap.put("Name", getName(sc));
		personMap.put("Birthday", getBirthday(sc));
		personMap.put("Hobby", getHobby(sc));
		personMap.put("Book", getBook(sc));
		personMap.put("Movie", getMovie(sc));
		printResults(personMap);

	}

}
