package midterm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Matthew Verrette				Flight.java
 * 
 * Professor Cross						Introduction to Programming
 * 
 * Create a driver class called FlightTest, whose main method 
 * instantiates and updates several Flight objects.  
 * 
 **/


public class FlightTest {
	
	//Creates new flight and returns flight string
	
	public static String createFlight() {
		
		String airlineString = null;
		do {
			String response;
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Airline Name: ");
			Flight flight = new Flight();
			flight.setAirline(scan.nextLine());
			System.out.print("Enter Flight Number: ");
			flight.setFlightNumber(scan.nextLine());
			System.out.print("Enter Flight Origin: ");
			flight.setFlightOrigin(scan.nextLine());
			System.out.print("Enter Flight Destination: ");
			flight.setFlightDestination(scan.nextLine());		
			do {
				System.out.println(flight.toString());
				System.out.print("Is this correct? (y/n) : ");
				
				response = scan.nextLine();
				if (response.toLowerCase().equals("n")) {
					airlineString = "";
				} else if (response.toLowerCase().equals("y")) {
					airlineString = flight.toString();
				} else {
					response = "";
				}
			} while (response.length() == 0);
		} while (airlineString.length() == 0);

		return airlineString;
		}

	public static void main(String[] args) {
		
		String response;
		// ArrayList for flights
		ArrayList<String> flights = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		// Gets and verifies user input 
		
		do {
			System.out.print("Create a new Flight? (y/n) : ");
			response = scan.nextLine();
			if (response.toLowerCase().equals("y")) {
				flights.add(createFlight());
			}
		} while (response.equalsIgnoreCase("y"));
		System.out.println("\n\n\n");
		System.out.println("***************************************"
				+ " Flight Infromation "
				+ "***************************************");
		
		// Prints flights when user is finished
		for (int i = 0; i < flights.size(); i++) {
			System.out.println(flights.get(i));
		}
	}
}
