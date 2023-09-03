package library.users;
import library.actions.Loan;
import library.actions.Reservation;


public class User {
	//Attributes
	//An user will have many reservations and loans, for now we are gonna have only one of each.
	
	protected String name;
	protected String email;
	protected String adress;
	protected Integer contact;
	protected Reservation reservation;
	protected Loan loan;
	// -> add punishment/history
	
	//Constructor 
	public User(String name, String email, String adress, Integer contact) {
		this.name = name;
		this.email = email;
		this.adress = adress;
		this.contact = contact;
	}

	
	// Encapsulation (Getters and Setters)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress(){
		return adress;
	}
	public void setAdress(){

	}

	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
}
