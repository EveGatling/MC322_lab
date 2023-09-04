package library.users;

//This class is an extension of User class

public class Employee extends User {
	//Attributes
	private String setor;
	
	//Constructor 
	public Employee(String name, String email, String setor) {
		super(name, email);
		this.setor = setor;
	}
	
	// Encapsulation (Getters and Setters)
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
}
