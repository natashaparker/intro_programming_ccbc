
/**
 * @author Matthew Verrette				Lab5b.java
 * 
 * Professor Cross						Introduction to Programming
 * 
 * Design and implement a class called Book that contains instance 
 * data for the title, author, publisher, and copyright date. Define the 
 * Book constructor to accept and initialize these data. Include setter 
 * and getter methods for all instance data. Include a toString
 * method that returns a nicely formatted, multiline description of 
 * the book. Create a driver class called Bookshelf, whose main
 * method instantiates and updates several Book objects.
 * 
 */

public class BookShelf {

	// Instantiates and modifies multiple book objects.
	
	public static void main(String[] args) {
		
		Book book1 = new Book("Ready Player One", "Ernst Cline",
				"Broadway Books", "June 6, 2012");
		
		Book book2 = new Book();
		
		Book book3 = new Book("Game of Thrones", "George R. Martin",
				"Bantam Books", "March 22, 2011");
		//Prints book object after Modification
		
		System.out.println("*** My Bookshelf Before ***");
		System.out.println("***************************");
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
		book1.setCopyrightDate("June 5, 2012");
		book2.setAuthor("Stephen King");
		book2.setTitle("Carrie");
		book2.setPublisher("Doubleday");
		book2.setCopyrightDate("May 1, 1990");
		book3.setAuthor("George R.R. Martin");
		
		//Prints book object after Modification
		
		System.out.println("*** My Bookshelf After ***");
		System.out.println("**************************");
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
	}

}
