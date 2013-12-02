import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
 */
public class ToDo {

	final static int HIGH = 0;
	final static int MEDIUM = 1;
	final static int LOW = 2;
	
	static boolean running = true;
	static List<Task> task_list = new ArrayList<Task>();
	
	public static void printTaskList() {
		if (task_list.isEmpty()) {
			System.out.println("* You have no tasks");
		} else {
			task_list = sortTaskList(task_list);
			System.out.println("* Priority\tTask");
			for(int i = 0; i < task_list.size(); i++) {
				if (task_list.get(i).getPriority() == HIGH) {
					System.out.print("* HIGH\t\t");
				} else if (task_list.get(i).getPriority() == MEDIUM) {
					System.out.print("* MEDIUM\t");
				} else if (task_list.get(i).getPriority() == LOW) {
					System.out.print("* LOW\t\t");
				}
				System.out.println(task_list.get(i).getTask());
			}
		}
	}
	
	
	
	private static List<Task> sortTaskList(List<Task> task_list2) {
		List<Task> task_sort = new ArrayList<Task>();
		Task t = new Task();
		while (task_sort.size() != task_list.size()) {
			for (int i = 0; i < task_list.size(); i++) {
				if (task_list.get(i).getPriority() == HIGH) {
					task_sort.add(task_list.get(i));
				}
			}
			for (int i = 0; i < task_list.size(); i++) {
				if (task_list.get(i).getPriority() == MEDIUM) {
					task_sort.add(task_list.get(i));
				}
			}
			for (int i = 0; i < task_list.size(); i++) {
				if (task_list.get(i).getPriority() == LOW) {
					task_sort.add(task_list.get(i));
				}
			}
		}
		
		return task_sort;
	}



	public static void createTask(){
		Scanner sc = new Scanner(System.in);
		Task task = new Task();
		System.out.print("* Enter new task: ");
		task.setTask(sc.nextLine());
		System.out.print("* Enter task priority (High, Medium, Low): ");
		String p = sc.nextLine();
		if (p.toLowerCase().equals("high")) {
			task.setPriority(HIGH);
		} else if (p.toLowerCase().equals("medium")) {
			task.setPriority(MEDIUM);
		} else if (p.toLowerCase().equals("low")) {
			task.setPriority(LOW);
		}
		task_list.add(task);
	}

	public static void header() {
		System.out.println("*******************************************");
		System.out.println("*          Welcome to Tasker              *");
		System.out.println("*           Java To-Do List               *");
		System.out.println("*******************************************");

	}
	
	public static void prompt() {
		System.out.println("*******************************************");
		System.out.println("* 1. Enter New Task                       *");
		System.out.println("* 2. View Task List                       *");
		System.out.println("* 3. quit                                 *");
		System.out.println("*******************************************");
	}
	
	public static void quit() {
		running = false;
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("* Tasker (1,2,3) >  ");
		String input = sc.nextLine();
		int command = Integer.parseInt(input);
		switch(command) {
			case 1:
				createTask();
				break;
			case 2:
				printTaskList();
				break;
			case 3:
				quit();
				break;
			default:
				System.out.println("Invalid");
				break;
		}
			
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		header();
		prompt();
		while(running) {
			input();
		}
		System.out.println("* Thank you for using tasker");
		System.out.println("*******************************************");
	}

}
