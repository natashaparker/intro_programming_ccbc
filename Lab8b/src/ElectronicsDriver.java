
/**
 * @author Matthew Verrette 		lab8b
 * Professor Cross					Intro to Programming
 *
 *
 * Design and implement a set of classes that define various 
 * types of electronics equipment (computers, cell phones, 
 * pagers, digital cameras, and so on). Include data values 
 * that describe various attributes of the electronics, such 
 * as the weight, cost, power usage, and name of the manufacturer. 
 * Include methods that are named appropriately for each class 
 * and that print an appropriate message. Create a driver class to 
 * instantiate and exercise several of the classes.
 */

public class ElectronicsDriver {

	public static void main(String[] args) {
		
		System.out.println("*********************** Electronics Driver ****************************");
		System.out.println("*       Creates Multiple Eletctronics based On Electronic Item        *");
		System.out.println("***********************************************************************");
		System.out.println();
		System.out.println("**************************************");
		System.out.println("****** Creating New Computer... ******");
		Computer computer = new Computer("ASUS", "Windows 8", 28.0,
				1099.98, 2.0);
		computer.Message();
		System.out.println("**************************************");
		System.out.println("****** Creating New Computer... ******");
		Computer macbook = new Computer("Apple", "OSX", 24.0, 1499.99, 
				1.5);
		macbook.Message();
		System.out.println("**************************************");
		System.out.println("******** Creating New Phone... *******");
		Phone iPhone = new Phone("Apple", "IOS", "AT&T", 3.95,
				499.98, .75);
		iPhone.Message();
		System.out.println("**************************************");
		System.out.println("******** Creating New Phone... *******");
		Phone galaxyS3 = new Phone("Samsung", "Android", "T-Mobile", 4.65,
				645.99, .8);
		galaxyS3.Message();
		System.out.println("**************************************");
		System.out.println("******** Creating New Camera *********");
		Camera powershot = new Camera("Cannon", 18, 5.0, 199.99, .5);
		powershot.Message();
		System.out.println("**************************************");
	}

}
