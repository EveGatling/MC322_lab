package library.actions;

import java.time.LocalDate;
import java.time.Period;
import java.util.Vector;

import library.constants.Reserve;
import library.constants.Reserve.ReserveStatus;
import library.media.Media;
import library.users.User;

public class Reservation {
	// Attributes
	private int id;
	private User user;
	private Vector<Media> media;
	private LocalDate beginningDate;
	private LocalDate endingDate;
	private LocalDate returnDate;
	private Loan loan;
	private ReserveStatus status;
	private double totalFine; // Calculated after returned

	// Class Constructor
	public Reservation(int id, LocalDate beginningDate, LocalDate endingDate, User user) {
		Period period = Period.between(beginningDate, endingDate);
		if (period.getDays() > Reserve.getReserveTimeLimit(user)) {
			System.out.println("Cannot reserve for more than 15 days.");
			return;
		}

		this.media = new Vector<>();
		this.beginningDate = beginningDate;
		this.endingDate = endingDate;
		this.returnDate = null;
		this.user = user;
		this.id = id;
		this.status = ReserveStatus.WAITING;
		this.loan = createLoan();
		user.addReservation(this);
	}

	public void addMedia(Media media) {
		if (this.media.size() > Reserve.getReserveAmountLimit(user)) {
			System.out.println("Cannot add any more media to this reservation.");
			return;
		}

		if (media.getIsAvailable()) {
			System.out.println("Media is unavailable at the moment.");
			return;
		}

		media.decreaseAvailableCopies();
		this.media.add(media);
	}

	public void cancelReservation() {
		this.returnMedia();
		this.status = ReserveStatus.CANCELLED;
	}

	public void returnMedia() {
		// Return reserved/loaned copies
		for (Media entry : media) {
			entry.increaseAvailableCopies();
		}

		this.returnDate = LocalDate.now();
	}

	public Loan createLoan() {
		if (this.loan != null) {
			return this.loan;
		}

		Loan loan = new Loan(this.id, user, this, LocalDate.now(), endingDate);
		return loan;
	}

	public void startLoan() {
		if (this.loan == null) {
			this.loan = createLoan();
		}
	}

	public Vector<Media> getMedia() {
		return this.media;
	}

	public ReserveStatus getReservationStatus() {
		return this.status;
	}

	public void setReservationStatus(ReserveStatus status) {
		this.status = status;
	}

	public int getId() {
		return this.id;
	}

	public void setEndingDate(LocalDate endingDate) {
		this.endingDate = endingDate;
	}

	public double calculateFine() {
		LocalDate returnDate = this.returnDate;
		if (returnDate == null) {
			returnDate = LocalDate.now();
		}

		int days = Period.between(this.endingDate, returnDate).getDays();

		if (days <= 0) {
			return 0;
		}

		this.totalFine = days * Reserve.getReserveFine(user);
		return this.totalFine;
	}

	public double getTotalFine() {
		return totalFine;
	}

	// Getters and Setters
	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setMedia(Vector<Media> media) {
		this.media = media;
	}

	public LocalDate getBeginningDate() {
		return this.beginningDate;
	}

	public void setBeginningDate(LocalDate beginningDate) {
		this.beginningDate = beginningDate;
	}

	public LocalDate getEndingDate() {
		return this.endingDate;
	}

	public LocalDate getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public Loan getLoan() {
		return this.loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public ReserveStatus getStatus() {
		return this.status;
	}

	public void setStatus(ReserveStatus status) {
		this.status = status;
	}

	public void setTotalFine(double totalFine) {
		this.totalFine = totalFine;
	}
}
