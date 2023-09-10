package library.users;

import java.time.LocalDate;

import java.util.Vector;

import library.actions.Reservation;
import library.media.Media;

public class User {
	// Essential Attributes
	protected int id;
	protected String phone;
	protected String name;
	protected String email;
	protected long registrationNumber;
	protected String address;
	protected LocalDate registrationDate;
	protected Vector<Reservation> reservations;

	// Constructor
	public User(int id, long registrationNumber, String name, String email, String phone, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.registrationNumber = registrationNumber;
		this.registrationDate = LocalDate.now();

		this.phone = phone;
		this.address = address;
		this.reservations = new Vector<>();

	}

	public Reservation createReservation(int id, Media media, LocalDate startDate, LocalDate endDate) {
		return new Reservation(id, startDate, endDate, this);
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(long registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	// Reservation Management
	public Vector<Reservation> getReservations() {
		return this.reservations;
	}

	public void addReservation(Reservation reservation) {
		this.reservations.add(reservation);
	}

	public void removeReservation(int reservationId) {
		this.reservations.removeIf(obj -> (obj.getId() == reservationId));
	}
}
