import java.util.Scanner;


public class Lab4a {

	public static void main(String[] args) {
		String my_string;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		
		my_string = scan.nextLine();

		for (int i = 0; i < my_string.length(); i++ ) {
			System.out.println(my_string.charAt(i));
		}
	}

}
