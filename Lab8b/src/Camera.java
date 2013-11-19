
public class Camera extends ElectronicItem{
	
	private static final String TYPE = "Camera";
	private int megapixel;

	public Camera(String manufacturer, int mp, double d, 
			double e, double f) {
		super(manufacturer, TYPE, d, e, f);
		this.megapixel = mp;
	}
	
	@Override
	public void Message() {
		String message = String.format("Type: %s"
				+ "\nManufacturer: %s"
				+ "\nImageQuality: %d MP"
				+ "\nPrice: $%.2f "
				+ "\nWeight: %.2f lbs"
				+ "\nPower: %.3f kw",
							type, manufacturer, megapixel, price, OzToLbs(weight), 
							WattsToKiloWatts(power));
		System.out.println(message);
	}

}
