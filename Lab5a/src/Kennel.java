
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

public class Kennel {
	
	// Instantiates and updates multiple dog objects
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("belle", 10);
		Dog dog2 = new Dog("Ralph", 3);
		Dog dog3 = new Dog("Spike", 1);
		Dog dog4 = new Dog("Pete", 5);
		
		System.out.println("Before Modification");
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		System.out.println(dog3.toString());
		System.out.println(dog4.toString());
		
		dog3.setName("Jack");
		dog1.setAge(8);
		dog2.setAge(4);
		
		System.out.println("\nAfter Modification");
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		System.out.println(dog3.toString());
		System.out.println(dog4.toString());

	}

}
