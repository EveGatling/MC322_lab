package library.actions;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Optional;
import java.util.Vector;

import library.constants.Reserve;
import library.constants.Reserve.FineStatus;
import library.constants.Reserve.ReserveStatus;
import library.media.Media;
import library.users.User;

public class Reservation {
	// Attributes
	private static int lastId = 0;
	private int id;
	private User user;
	private Vector<Media> media;
	private LocalDateTime beginningDate;
	private LocalDateTime endingDate;
	private LocalDateTime returnDate;
	private Loan loan;
	private ReserveStatus status;
	private FineStatus fineStatus;
	private double totalFine; // Calculated after returned

	// Class Constructor
	public Reservation(LocalDateTime beginningDate, int days, User user) {
		if (days > Reserve.getReserveTimeLimit(user)) {
			throw new Error("Cannot reserve for more than 15 days.");
		}

		this.media = new Vector<>();
		this.beginningDate = beginningDate;
		this.endingDate = beginningDate.plusDays(days);
		this.returnDate = null;
		this.user = user;
		this.id = lastId + 1;
		this.status = ReserveStatus.WAITING;
		this.loan = createLoan();
		this.fineStatus = FineStatus.NO_FINE;
		user.addReservation(this);

		lastId += 1;
	}

	public void addMedia(Media media) {
		if (this.media.size() >= Reserve.getReserveAmountLimit(user)) {
			System.out.println("Cannot add any more media to this reservation.");
			return;
		}

		if (!media.getIsAvailable()) {
			System.out.println("Media is unavailable at the moment.");
			return;
		}

		media.decreaseAvailableCopies();
		media.increaseTimesReserved();
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

		this.returnDate = LocalDateTime.now();
	}

	public Loan createLoan() {
		if (this.loan != null) {
			return this.loan;
		}

		Loan loan = new Loan(this.id, user, this, LocalDateTime.now(), endingDate);
		return loan;
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

	public void setEndingDate(LocalDateTime endingDate) {
		this.endingDate = endingDate;
	}

	public double calculateFine() {
		LocalDateTime returnDate = this.returnDate;
		if (returnDate == null) {
			returnDate = LocalDateTime.now();
		}

		long days = Duration.between(this.endingDate, returnDate).toDays();

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

	public LocalDateTime getBeginningDate() {
		return this.beginningDate;
	}

	public void setBeginningDate(LocalDateTime beginningDate) {
		this.beginningDate = beginningDate;
	}

	public LocalDateTime getEndingDate() {
		return this.endingDate;
	}

	public LocalDateTime getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
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

	public FineStatus getFineStatus() {
		return this.fineStatus;
	}

	public void removeMedia(Media media) {
		Optional<Media> entry = this.media.stream().filter(obj -> (obj.getId() == media.getId())).findFirst();

		if (!entry.isPresent()) {
			throw new Error("Media not reserved");
		}

		entry.get().increaseAvailableCopies();
		entry.ifPresent(this.media::remove);
	}

	public Reservation renewReservationOfMediaItems(Vector<Media> items, int days) {
		for (Media media : items) {
			this.removeMedia(media);
		}

		Reservation newReservation = new Reservation(LocalDateTime.now(), days, this.user);

		for (Media media : items) {
			newReservation.addMedia(media);
		}

		return newReservation;
	}
}
