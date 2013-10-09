/**
 * 
 */

/**
 * @author user
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

	public String toString() {	
		return String.format("Name: %s Human Years: %d Dog Years: %d", 
				name, age, ageToDogYears(age));
	}


}
