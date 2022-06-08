/**
 * 15 April 2022
 * Purpose: customer paying at restaurant input 
 */
public class Item {
	// name of items
	private String name;

	//price of items
	private double price ; 

	// quantity of items
	private int quantity;



	/**
	 * accepts name, price, and quantity from customer and sets instance fields 
	 * gets name of item and return
	 * gets price of item and returns 
	 * gets quantity of item and returns 
	 * computes and returns subtotal amount
	 * overrides and returns string format 
	 */
	public Item (String name, double price, int quantity) {
		this.name = name;

		this.price = price;

		this.quantity = quantity;
	}

	
	public String getName() {
		return name;

	}
	
	public double getPrice() {
		return price;
	}

	
	public int getQuantity() {
		return quantity;
	}

	
	public double getSubTotal() {
		return (price * quantity);
	}

	@Override
	public String toString() {
		return String.format("%-15s %,10.2f %10d %10.2f\n", name, price,quantity,getSubTotal());
	}





}
