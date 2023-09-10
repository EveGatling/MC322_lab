package library.users;

//This class is an extension of User class

public class Student extends User {
	// Attributes
	private String course;

	public Student(int id, String name, String email, int registrationNumber, String phone, String address) {
		super(id, registrationNumber, name, email, phone, address);
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
