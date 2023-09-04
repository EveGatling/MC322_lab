package library.users;

//This class is an extension of User class

public class Professor extends User{
	//Attributes
	private String faculty_institute;
	
	//Constructor 
	public Professor(String name, String email, String faculty_institute) {
		super(name, email);
		this.faculty_institute = faculty_institute;
	}
	
	// Encapsulation (Getters and Setters)
	public String getFaculty_institute() {
		return faculty_institute;
	}

	public void setFaculty_institute(String faculty_institute) {
		this.faculty_institute = faculty_institute;
	}
}
