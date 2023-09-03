package library.users;

//This class is an extension of User class

public class Student extends User {
	//Attributes
	private String course;
	private int ra;
	private String degree;
	
	//Constructor 
	public Student(String name, String email, String course, int ra, String degree, String adress, Integer contact){
		super(name, email, adress, contact);
		this.course = course;
		this.degree = degree;
		this.ra = ra;
	}
	
	// Encapsulation (Getters and Setters)
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}	
}
