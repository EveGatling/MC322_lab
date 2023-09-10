package library.actions;

import java.util.Vector;
import java.time.LocalDate;

import library.constants.Reserve.ReserveStatus;
import library.media.Media;
import library.users.User;

public class Loan {
	// Attributes
	private int id;
	private User user;
	private Vector<Media> media;
	private Reservation reservation;
	private LocalDate beginningDate;
	private LocalDate returnDate;

	// Class Constructor
	public Loan(int id, User user, Reservation reservation, LocalDate beginningDate, LocalDate returnDate) {
		// Check if book was reserved. If not, create an instant reservation.
		if (reservation == null) {
			throw new Error("Loan cannot be instantiated without a previous reservation");
		}

		this.media = reservation.getMedia();
		this.user = user;
		this.beginningDate = beginningDate;
		this.returnDate = returnDate;
		this.reservation = reservation;
		this.id = id;
	}

	public void startLoan() {
		this.reservation.setReservationStatus(ReserveStatus.LOANED);
	}

	public void endLoan() {
		this.reservation.setReservationStatus(ReserveStatus.RETURNED);
		this.reservation.returnMedia();
	}

	public void renewLoan(LocalDate newReturnDate) {
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

	public Vector<Media> getMedia() {
		return this.media;
	}

	public void setMedia(Vector<Media> media) {
		this.media = media;
	}

	public Reservation getReservation() {
		return this.reservation;
	}

	public LocalDate getBeginningDate() {
		return this.beginningDate;
	}

	public void setBeginningDate(LocalDate beginningDate) {
		this.beginningDate = beginningDate;
	}

	public LocalDate getReturnDate() {
		return this.returnDate;
	}
}
