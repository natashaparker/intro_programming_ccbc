package midterm;

/**
 * @author Matthew Verrette				Flight.java
 * 
 * Professor Cross						Introduction to Programming
 * 
 * Design and implement a class called Flight that represents an airline 
 * flight. It should contain instance data that represent the  airline 
 * name, the flight number, and the flight’s origin and destination cities. 
 * Define the Flight constructor to accept and initialize all instance data. 
 * Include getter and setter methods for all instance data. Include a toString 
 * method that returns a one-line description of the flight. 
 * 
 **/

public class Flight {
	
	private String airline;
	private String flight_number;
	private String flight_origin;
	private String flight_destination;
	
	
	// Allows for initialization of Flight without values;
	
	public Flight() {
		
	}
	
	// Initialize Flight with values
	
	public Flight(String airline, String flight_number,
			String flight_origin, String flight_destination) {
		this.airline = airline;
		this.flight_number = flight_number;
		this.flight_origin = flight_origin;
		this.flight_destination = flight_destination;
		
	}
	
	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getFlightNumber() {
		return flight_number;
	}

	public void setFlightNumber(String flight_number) {
		this.flight_number = flight_number;
	}

	public String getFlightOrigin() {
		return flight_origin;
	}

	public void setFlightOrigin(String flight_origin) {
		this.flight_origin = flight_origin;
	}

	public String getFlightDestination() {
		return flight_destination;
	}

	public void setFlightDestination(String flight_destination) {
		this.flight_destination = flight_destination;
	}

	// Returns Class flight information as string
	
	public String toString() {
		return "Flight [airline=" + airline + ", flight_number="
				+ flight_number + ", flight_origin=" + flight_origin
				+ ", flight_destination=" + flight_destination + "]";
	}

}
