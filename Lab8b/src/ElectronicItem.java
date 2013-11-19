/**
 * 
 */

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

public class ElectronicItem {

	protected String manufacturer;
	protected String type;
	protected double weight;
	protected double price;
	protected double power;
	
	public ElectronicItem(String manufacturer, String type,
						double weight, double price, double power) {
		this.manufacturer = manufacturer;
		this.type = type;
		this.weight = weight;
		this.price = price;
		this.power = power;
	}
	
	public double OzToLbs(double weight) {
		return (weight / 16.0);
	}
	
	public double WattsToKiloWatts(double power) {
		return (power / 1000.0);
	}
	
	public void Message() {
		
	}

}
