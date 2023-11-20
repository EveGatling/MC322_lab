package library.reports;

import java.util.Vector;

import library.actions.Reservation;
import library.constants.Reserve.FineStatus;
import library.users.User;

public class FinesAndPaymentReport {
  public Vector<Double> amountPaidList = new Vector<>();
  public Vector<Double> amountOwedList = new Vector<>();
  public int totalAmountOwed;
  public int totalAmountPaid;
  public User user;

  // Calculate fines for the provided user, providing the list of reservations with pending
  // fines and the total amount owed.
  public FinesAndPaymentReport(User user) {
    this.user = user;
    for (Reservation<?> reservation : user.getReservations()) {
      if (reservation.getTotalFine() > 0 && reservation.getFineStatus() != FineStatus.PAID_OUT) {
        this.totalAmountOwed += reservation.getTotalFine();
        this.amountOwedList.add(reservation.getTotalFine());
      } else if (reservation.getTotalFine() > 0 && reservation.getFineStatus() == FineStatus.PAID_OUT) {
        this.totalAmountPaid += reservation.getTotalFine();
        this.amountPaidList.add(reservation.getTotalFine());
      }
    }
  }

  public String toString() {
    return String.format("%s (%d, %d)", user.getName(), totalAmountOwed, totalAmountPaid);
  }
}
