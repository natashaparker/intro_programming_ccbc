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
public class HospitalEmployee {
	
	protected String job;
	protected String hospital;
	
	public HospitalEmployee(String job, String hospital) {
		this.job = job;
		this.hospital = hospital;
	}
	
	public void PerformJobs() {
		
	}

}
