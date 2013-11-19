
/**
 * @author Matthew Verrette				Lab5a.java
 * 
 * Professor Cross						Introduction to Programming
 * 
 * 
 * Design and implement a class called Dog that contains instance 
 * data that represent the dog’s name and age. Define the Dog 
 * constructor to accept and initialize instance data. Include getter 
 * and setter methods for the name and age. Include a method to compute 
 * and return the age of the dog in “person years” (seven times the 
 * dog’s age). Include a toString method that returns a one-line 
 * description of the dog. Create a driver class called Kennel, whose 
 * main method instantiates and updates several Dog objects.
 * 
 */

public class Dog {

	/**
	 * 
	 */
	
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	// Multiplies dog's age in years by 7 to get age in dog years
	
	public int ageToDogYears(int age){
		return age * 7;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// Returns a Dog Object as string

	public String toString() {	
		return String.format("Name: %s Human Years: %d Dog Years: %d", 
				name, age, ageToDogYears(age));
	}

}
