/**
 * 
 */

/**
 * @author Matthew Verrette				Lab8a
 *
 * Professor Cross						Introduction to Programming
 *
 * Design and implement a set of classes that define the employees 
 * of a hospital: doctor, nurse, administrator, surgeon, receptionist, 
 * janitor, and so on. Include methods in each class that are named 
 * according to the services provided by that person and that print an 
 * appropriate message. Create a driver class to instantiate and 
 * exercise several of the classes.
 */

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		System.out.println("**************** Employee Driver *****************");
		System.out.println("*       Creates Hospital Employee Objects        *");
		System.out.println("*   Performs and prints Employee Task Message    *");
		System.out.println("**************************************************");
		System.out.println();
		
		System.out.println("Creating Administrator...");
		Administrator admin = new Administrator("Sinai Hospital of Baltimore");
		System.out.println("Creating Doctor Employee...");
		Doctor doctor = new Doctor("Franklin Square Medical Center");
		System.out.println("Creating Janitor Employee...");
		Janitor janitor = new Janitor("St. Jude Hospital");
		System.out.println("Creating Nurse Employee...");
		Nurse nurse = new Nurse("John Hopkins Hosptial");
		System.out.println("Creating Receptionist Employee...");
		Receptionist receptionist = new Receptionist("Harbor Hospital");
		System.out.println("Creating Surgeon Employee...");
		Surgeon surgeon = new Surgeon("Mercy Medical Center");
		System.out.println();
		System.out.println("Performing Job...");
		admin.PerformJobs();
		System.out.println("Performing Job...");
		doctor.PerformJobs();
		System.out.println("Performing Job...");
		janitor.PerformJobs();
		System.out.println("Performing Job...");
		nurse.PerformJobs();
		System.out.println("Performing Job...");
		receptionist.PerformJobs();
		System.out.println("Performing Job...");
		surgeon.PerformJobs();
		
		System.out.println();
		System.out.println("********************** FIN ************************");
	}

}
