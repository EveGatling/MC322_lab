package library.users;

import java.time.LocalDateTime;

import java.util.Vector;
import java.util.List;

import library.actions.Reservation;
import library.actions.Reservable;

public class User {
	// Essential Attributes
	protected int id;
	protected String phone;
	protected String name;
	protected String email;
	protected long registrationNumber;
	protected String address;
	protected LocalDateTime registrationDate;
	protected List<Reservation<?>> reservations;

	// Constructor
	public User(int id, long registrationNumber, String name, String email, String phone, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.registrationNumber = registrationNumber;
		this.registrationDate = LocalDateTime.now();

		this.phone = phone;
		this.address = address;
		this.reservations = new Vector<>();
	}

	public <T extends Reservable> Reservation<T> createReservation(LocalDateTime startDate, int days) {
		return new Reservation<T>(startDate, days, this);
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

	public LocalDateTime getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	// Reservation Management
	public List<Reservation<?>> getReservations() {
		return this.reservations;
	}

	public void addReservation(Reservation<?> reservation) {
		this.reservations.add(reservation);
	}

	public void removeReservation(int reservationId) {
		this.reservations.removeIf(obj -> (obj.getId() == reservationId));
	}

}
