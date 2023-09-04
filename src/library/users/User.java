package library.users;

import java.time.LocalDate;

import library.actions.Loan;
import library.actions.Reservation;

public class User {
	// Attributes
	// An user will have many reservations and loans, for while we are gonna have
	// only one of each.

	protected String name;
	protected String email;
	protected Reservation reservation;
	protected Loan loan;
	protected String address;
	protected String phone;
	protected LocalDate registrationDate;
	// -> add punishment/history

	// Constructor
	public User(String name, String email) {
		this.name = name;
		this.email = email;
		this.registrationDate = LocalDate.now();
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
