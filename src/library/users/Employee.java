package library.users;

//This class is an extension of User class

public class Employee extends User {
	//Attributes
	private String sector;
	
	//Constructor 
	public Employee(String name, String email, String sector, String adress, Integer contact) {
		super(name, email, adress, contact);
		this.sector = sector;
	}
	
	// Encapsulation (Getters and Setters)
	public String getsector() {
		return sector;
	}

	public void setsector(String sector) {
		this.sector = sector;
	}
}
