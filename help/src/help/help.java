package help;

import java.util.Scanner;

public class help {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter two values");
	float valA;
	float valB;
	
	float sum;
	float difference;
	float product; 
	System.out.print("Value A: ");
	valA = scan.nextFloat();
	System.out.print("Value B: ");
	valB = scan.nextFloat();
			
	sum = valA + valB;
	difference = valA - valB;
	product = valA * valB;
	System.out.println("Sum: " + sum);
	System.out.println("Difference: " + difference);
	System.out.println("Product: " + product);
	}
}
