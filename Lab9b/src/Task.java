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
 *
 */
public class Task implements Priority {

	private final int HIGH = 0;
	private final int MEDIUM = 1;
	private final int LOW = 2;
	
	private String task;
	private int priority;

	public Task(String task, int priority) {
		this.task = task;
		this.priority = priority;
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
