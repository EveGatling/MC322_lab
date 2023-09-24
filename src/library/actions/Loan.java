package library.actions;

import java.util.Vector;
import java.time.LocalDateTime;

import library.constants.Reserve.ReserveStatus;
import library.users.User;

public class Loan<T extends Reservable> {
	// Attributes
	private int id;
	private User user;
	private Vector<T> items;
	private Reservation<T> reservation;
	private LocalDateTime beginningDate;
	private LocalDateTime returnDate;

	// Class Constructor
	public Loan(int id, User user, Reservation<T> reservation, LocalDateTime beginningDate, LocalDateTime returnDate) {
		// Check if book was reserved. If not, create an instant reservation.
		if (reservation == null) {
			throw new Error("Loan cannot be instantiated without a previous reservation");
		}

		this.items = reservation.getItems();
		this.user = user;
		this.beginningDate = beginningDate;
		this.returnDate = returnDate;
		this.reservation = reservation;
		this.id = id;
	}

	public void startLoan() {
		this.reservation.setReservationStatus(ReserveStatus.LOANED);

		// Generate statistics on the amount of times it was loaned
		for (T entry : this.items) {
			entry.increaseTimesLoaned();
		}
	}

	public void endLoan() {
		this.reservation.setReservationStatus(ReserveStatus.RETURNED);
		this.reservation.returnItem();
	}

	public void renewLoan(LocalDateTime newReturnDate) {
		this.returnDate = newReturnDate;
		this.reservation.setEndingDate(newReturnDate);
	}

	// Getters and Setters
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Vector<T> getItems() {
		return this.items;
	}

	public void setItems(Vector<T> item) {
		this.items = item;
	}

	public Reservation<T> getReservation() {
		return this.reservation;
	}

	public LocalDateTime getBeginningDate() {
		return this.beginningDate;
	}

	public void setBeginningDate(LocalDateTime beginningDate) {
		this.beginningDate = beginningDate;
	}

	public LocalDateTime getReturnDate() {
		return this.returnDate;
	}
}
