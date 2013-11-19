
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

public class Book {

	private String title;
	private String author;
	private String publisher;
	private String copyright_date;
	
	// Instantiates book object with parameters
	
	public Book(String title, String author,
				String publisher, String date) {
		setTitle(title);
		setAuthor(author);
		setPublisher(publisher);
		setCopyrightDate(date);
	}
	
	// Instantiates Book object without paramaters
	
	public Book(){
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCopyrightDate() {
		return copyright_date;
	}

	public void setCopyrightDate(String copyright_date) {
		this.copyright_date = copyright_date;
	}
	
	// Outputs multiline description of book
	
	public String toString() {
		String book;
		
		book = String.format("%s\n%s\n%s\t%s\n",
				getAuthor(), getTitle(), getPublisher(),
				getCopyrightDate());
		
		return book;
		
	}

}
