
/**
 * Spring 2022
 * 15 April 2022
 * Purpose: customer paying at restaurant input 
 */
public class Customer {



	// declares first name field 
	private String firstName;
	// declares last name field
	private String lastName;

	/**
	 * line 32 gets customers first name then returns
	 * line 36 sets customers first name and  returns it 
	 * line 40 gets customer's last name and returns it 
	 * line 44 sets customer's last name and returns it
	 * line 49  overrides and returns customers first and last name
	 * 
	 */
	
	public Customer(){

	}
	
	public String getfirstName() {
		return  firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}	
	
	public String getlastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString(){
		return ("Customer: " + firstName + " " + lastName);
	}
}


