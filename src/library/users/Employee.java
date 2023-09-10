package library.users;

//This class is an extension of User class

public class Employee extends User {
	// Attributes
	private String sector;

	// Constructor
	public Employee(int id, String name, String email, int registrationNumber, String phone, String address) {
		super(id, registrationNumber, name, email, phone, address);
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String setor) {
		this.sector = setor;
	}
}
