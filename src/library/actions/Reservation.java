package library.actions;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Vector;

import library.constants.Reserve;
import library.constants.Reserve.FineStatus;
import library.constants.Reserve.ReserveStatus;
import library.users.User;

public class Reservation<T extends Reservable> {
	// Attributes
	private static int lastId = 0;
	private int id;
	private User user;
	private Vector<T> items;
	private LocalDateTime beginningDate;
	private LocalDateTime endingDate;
	private LocalDateTime returnDate;
	private Loan<T> loan;
	private ReserveStatus status;
	private FineStatus fineStatus;
	private double totalFine; // Calculated after returned

	// Class Constructor
	public Reservation(LocalDateTime beginningDate, int days, User user) {
		Integer reserveLimit = Reserve.getReserveTimeLimit(user);

		if (days > reserveLimit) {
			throw new Error("Cannot reserve for more than " + reserveLimit.toString() + " days.");
		}

		if (user.hasPendingFines()) {
			throw new Error("User cannot reserve. Reason: Pending Fines");
		}

		this.items = new Vector<>();
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

	public void addItem(T item) {
		if (this.items.size() >= Reserve.getReserveAmountLimit(user)) {
			System.out.println("Cannot add any more items to this reservation.");
			return;
		}

		if (!item.getIsAvailable()) {
			System.out.println("Item is unavailable at the moment.");
			return;
		}

		item.decreaseAvailableCopies();
		item.increaseTimesReserved();
		this.items.add(item);
	}

	public void cancelReservation() {
		this.returnItem();
		this.status = ReserveStatus.CANCELLED;
	}

	public void returnItem() {
		// Return reserved/loaned copies
		for (T entry : items) {
			entry.increaseAvailableCopies();
		}

		this.returnDate = LocalDateTime.now();
	}

	public Loan<T> createLoan() {
		if (this.loan != null) {
			return this.loan;
		}

		Loan<T> loan = new Loan<>(this.id, user, this, LocalDateTime.now(), endingDate);
		return loan;
	}

	public Vector<T> getItems() {
		return this.items;
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

	public void setItems(Vector<T> item) {
		this.items = item;
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

	public Loan<T> getLoan() {
		return this.loan;
	}

	public void setLoan(Loan<T> loan) {
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

	public void removeItem(T item) {
		Optional<T> entry = this.items.stream().filter(obj -> (obj.getId() == item.getId())).findFirst();

		// 3.2.1 - Error if user tries to return item they did not loan
		if (!entry.isPresent()) {
			throw new Error("Item is not reserved");
		}

		entry.get().increaseAvailableCopies();
		entry.ifPresent(this.items::remove);
	}

	public Reservation<T> renewReservationOfItems(Vector<T> items, int days) {
		for (T item : items) {
			this.removeItem(item);
		}

		Reservation<T> newReservation = new Reservation<>(LocalDateTime.now(), days, this.user);

		for (T item : items) {
			newReservation.addItem(item);
		}

		return newReservation;
	}
}
