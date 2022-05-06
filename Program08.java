
import java.util.Scanner;

/**
 * CPS141 - Spring 2022
 * 
 * Main program for Program 08 - DCC Diner Receipt
 * A simple receipt Simulator
 * 
 * DO NOT MAKE ANY CHANGES IN THIS FILE EXCEPT ON LINE 1 IF NEEDED.
 * DO NOT UPLOAD THIS FILE WITH THE ASSIGNMENT SUBMISISON.
 * DO NOT MAKE ANY "CORRECTIONS" BASED ON ERRORS REPORTED
 * IN THIS FILE. ANY ERRORS REPORTED HERE WILL BE DUE TO
 * ERRORS IN OTHER FILES.
 * 
 * DO REVIEW THIS FILE AS AN EXAMPLE FOR FUTURE PROJECS IF NEEDED.
 * 
 * @author joneesacammorato
 *
 */
public class Program08 {

	public static void main(String[] args) {
		
		// Declare a Scanner class to get keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Print a welcome message
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		System.out.println("+        Welcome to the DCC Diner           +");
		System.out.println("+            Receipt Simulator              +");
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		System.out.println();
		System.out.println();
		
		// Declare a Customer object and get information from the user.
		// Get the input from the user for the variables
		Customer customer = new Customer();
		
		// Get the customer first name
		System.out.print("Enter the customer's first name: ");
		customer.setFirstName(keyboard.nextLine());

		// Get the customer last name
		System.out.print("Enter the customer's last name:  ");
		customer.setLastName(keyboard.nextLine());

		// Get the current date
		System.out.print("Enter today's date:              ");
		String dateString = keyboard.nextLine();
		System.out.println();

		// Create the Receipt object
		Receipt receipt = new Receipt(customer, dateString);
		
		// While loop to accept input from the user
		System.out.print("Would you like to add an item? (y/n): ");
		int itemCount = 0;
		while (keyboard.nextLine().charAt(0) == 'y') {

			// get item input from the use
			// Prompt the user for item
			itemCount++;
			System.out.printf("Enter the name for Item %d:     ", itemCount);
			String itemName = keyboard.nextLine();
			System.out.printf("Enter the price for Item %d:    ", itemCount);
			double itemPrice = Double.parseDouble(keyboard.nextLine());
			System.out.printf("Enter the quantity for Item %d: ", itemCount);
			int itemQuantity = Integer.parseInt(keyboard.nextLine());
			
			// Create the item
			Item item = new Item(itemName, itemPrice, itemQuantity);

			// Add the item to the budget
			
			receipt.addItem(item);
			
			// prompt the user
			System.out.println();
			System.out.print("Would you like to add an item? (y/n): ");
		}
		System.out.println("\n\n");
		
		// Print out the receipt
		System.out.println(receipt);
		
		// close the keyboard
		keyboard.close();
	}

}
