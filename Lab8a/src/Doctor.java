/**
 * 
 */

/**
 * @author Matthew Verrette				lab8a
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
public class Doctor extends HospitalEmployee {

	// Static Job Title
	private final static String job_title = "Doctor";

	// Constructor requires hospital of employee
	// passes to super constructor
	public Doctor(String hospital) {
		super(job_title, hospital);
	}
	
	//prints diagnose message
	public void Diagnose() {
		String message = String.format(
				"The %s diagnoses patients at %s.", job, hospital);
		System.out.println(message);
	}
	
	@Override
	public void PerformJobs() {
		Diagnose();
	}

}
