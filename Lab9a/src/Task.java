/**
 * 
 */

/**
 * @author Matthew Verrette				Lab9a.java
 * 
 * Professor Cross						Introduction to Programming
 *
 * Modify the Task class from Programming Project 9.6 so that it 
 * also implements the Comparable interface from the Java standard 
 * class library. Implement the interface such that the tasks are 
 * ranked by priority. Create a driver class whose main method shows 
 * these new features of Task objects.
 *
 */
public class Task implements Priority, Comparable<Task> {

	private final int HIGH = 0;
	private final int MEDIUM = 1;
	private final int LOW = 2;
	
	private String task;
	private int priority;

	public Task(String task, int priority) {
		this.task = task;
		this.priority = priority;
	}
	
	public Task() {

	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public int getPriority() {
		return priority;
	}
	
	@Override 
	public int compareTo(Task aTask) {
		final int LOWER = -1;
		final int EQUAL = 0;
		final int HIGHER = 1;
		
		if (this == aTask) return EQUAL;
		if (this.priority == aTask.priority) return EQUAL;
		if (this.priority < aTask.priority) return HIGHER;
		if (this.priority > aTask.priority) return LOWER;
		
		return EQUAL;
	}

	@Override
	public String toString() {
		String task_string;
		if (priority == HIGH) {
			task_string = "Task [ task=" + task + " priority=HIGH ]";   
		} else if (priority == MEDIUM) {
			task_string = "Task [ task=" + task + " priority=MEDIUM ]"; 
		} else if (priority == LOW ) {
			task_string = "Task [ task=" + task + " priority=LOW ]"; 
		} else {
			task_string = "Task [ task=" + task + " priority=None ]"; 
		}
		return task_string;
	}

}
