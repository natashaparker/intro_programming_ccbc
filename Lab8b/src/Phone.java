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

public class Phone extends ElectronicItem {

	private static final String TYPE = "Phone";
	private String os;
	private String carrier;
	
	public Phone(String manufacturer,String os, String carrier, double d, 
			double e, double f) {
		super(manufacturer, TYPE, d, e, f);
		this.os = os;
		this.carrier = carrier;
	}
	
	@Override
	public void Message() {
		String message = String.format("Type: %s"
				+ "\nManufacturer: %s"
				+ "\nOperating System: %s"
				+ "\nCarrier: %s"
				+ "\nPrice: $%.2f "
				+ "\nWeight: %.2f lbs"
				+ "\nPower: %.3f kw",
							type, manufacturer, carrier, os, price, OzToLbs(weight), 
							WattsToKiloWatts(power));
		System.out.println(message);
	}

}
