package library.users;

//This class is an extension of User class

public class Professor extends User {
	// Attributes
	private String faculty_institute;

	public Professor(int id, String name, int registrationNumber, String password) {
		this(id, name, null, registrationNumber, null, null, password);
	}

	// Constructor
	public Professor(int id, String name, String email, int registrationNumber, String phone, String address,
			String password) {
		super(id, registrationNumber, name, email, phone, address, password);
	}

	public String getFaculty_institute() {
		return this.faculty_institute;
	}

	public void setFaculty_institute(String faculty_institute) {
		this.faculty_institute = faculty_institute;
	}

}
