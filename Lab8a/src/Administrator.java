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
 *
 */

public class Administrator extends HospitalEmployee {

	// Static Job Title
	private final static String job_title = "Administrator";

	// Constructor requires hospital of employee
	// passes to super constructor
	public Administrator(String hospital) {
		super(job_title, hospital);
	}
	
	//Prints paperwork message
	public void Paperwork() {
		String message = String.format(
				"The %s does Paperwork at %s.", job, hospital);
		System.out.println(message);
	}

	@Override
	public void PerformJobs() {
		Paperwork();
	}
	
}
