package library.users;

//This class is an extension of User class
public class Employee extends User {
	private String sector;

	public Employee(int id, String name, String email, int registrationNumber, String phone, String address,
			String password) {
		super(id, registrationNumber, name, email, phone, address, password);
	}

	// Getters and Sectors

	public String getSector() {
		return sector;
	}

	public void setSector(String setor) {
		this.sector = setor;
	}
}
