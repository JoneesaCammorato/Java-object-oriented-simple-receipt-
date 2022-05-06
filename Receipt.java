import java.util.ArrayList;

/**
 * Joneesa Cammorato
 * CPS141 - Spring 2022
 * 15 April 2022
 * Purpose: customer paying at restaurant input 
 * Assignment: Program 08 
 * @author joneesacammorato
 */
public class Receipt {

	//8.25% tax calculation
	final static double TAX_RATE = 0.0825;

	//20% tip calculation
	final static double TIP_RATE = 0.2;

	// aggregated customer instance
	private Customer customer;

	//aggregated item objects that stores an instance of each item 
	private ArrayList<Item> items;

	// string field for data 
	private String dateString;

	/**
	 * Receipt :
	 * accepts customer instance and date string
	 * sets instance fields 
	 * initializes items arraylist field
	 * addItem:
	 * adds a new item instance and adds item to the array
	 * getReceiptSubTotal:
	 * computes total value of all item instances
	 *accumulates receipt total by iterating item objects
	 *add local accumulator variable 
	 *returns accumulator variable
	 *  toString :
	 * concatenates customer information from customer field
	 * concatenates datestring field 
	 * concatenates item table header using string format
	 * loop to concatenate all strings 
	 * overrides and returns output
	 */
	public Receipt (Customer customer, String dateString ){	
		items = new ArrayList<>();

		this.dateString = dateString;

		this.customer = customer;

	}


	public boolean addItem (Item item) {

		return items.add(item);

	}

	public double getReceiptSubTotal() {
		double subtotal = 0;

		for(int i = 0 ; i<items.size(); i++) {

			Item item = items.get(i);

			subtotal+= item.getSubTotal();



		}
		return subtotal;


	}
	
	
	@Override
	public String  toString () {
		// local string variable to accumulate receipt components
		String output = "";
		// concatenates header 
		output+= "--------------------------------------------------------------------\n";
		
		
		output += String.format("%-10s %s\n","Customer:",customer);

		output+= String.format("%-10s %s\n"," Date :" , dateString);

		output+= String.format("%-15s %10s %10s %10s\n" ,"Item", "Price", "Qty", "Total");

		// concatenates row separator
		output+= "--------------------------------------------------------------------\n";

		for(int i=0; i<items.size(); i++) {
			output += items.get(i);
			output += "\n";
			if (i + 1<items.size()) {
				output += "\n";

			}

		}
		// concatenates row separator
		output+= "---------------------------------------------------------------------\n";
		// computes subtotal and saves as local variable  
		double subTotal = getReceiptSubTotal();

		// compute the tax
		double tax  = TAX_RATE * subTotal;

		// compute the tip		
		double tip = TIP_RATE * (subTotal + tax);

		// compute the total
		double total = subTotal + tax + tip;
		// concatenates total , subtotal, tax, tip, and thank you message
		output+= String.format("%37s %10.2f\n\n", "Sub Total:", subTotal);
		output+= String.format("%37s %10.2f\n\n", "Tax (8.25%):", tax);
		output+= String.format("%37s %10.2f\n\n", "Tip (20%):", tip);
		output+= String.format("%37s %10.2f\n\n", "Total:", total);
		output+= String.format(" Thank you for shopping with us!               " );
		// returns output
		return output;
	}


}


