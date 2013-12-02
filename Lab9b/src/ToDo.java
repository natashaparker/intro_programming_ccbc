/**
 * 
 */

/**
 * @author user
 *
 * Design a Java interface called Priority that includes two methods: setPriority 
 * and getPriority. The interface should define a way to establish numeric 
 * priority among a set of objects. Design and implement a class called Task that 
 * represents a task (such as on a to-do list) that implements the Priority 
 * interface. Create a driver class to exercise some Task objects.
 */
public class ToDo {

	private static final int HIGH = 0;
	private static final int MEDIUM = 1;
	private static final int LOW = 2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Task task1 = new Task("task 1", HIGH);
		Task task2 = new Task("Task 2", MEDIUM);
		Task task3 = new Task("Task 3", LOW);
		System.out.println(task1.toString());
		System.out.println(task2.toString());
		System.out.println(task3.toString());

		
	}

}
