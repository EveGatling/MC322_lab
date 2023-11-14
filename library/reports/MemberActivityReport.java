package library.reports;

import java.time.LocalDateTime;

import library.actions.Reservation;
import library.constants.Reserve.ReserveStatus;
import library.users.User;

public class MemberActivityReport {
  public int loans;
  public int devolutions;
  public int reserves;
  public int numberItemsReserved;
  public int numberItemsReturned;
  public double totalFines;
  public User user;

  public MemberActivityReport(User user, LocalDateTime startDate, LocalDateTime endDate) {
    if (user == null) {
      throw new Error("Failured to generate report for null user");
    }

    this.user = user;

    for (Reservation<?> reservation : user.getReservations()) {
      if (reservation.getBeginningDate().compareTo(startDate) < 0
          || reservation.getEndingDate().compareTo(endDate) > 0) {
        continue;
      }

      double totalFine = reservation.getTotalFine();
      this.reserves += 1;

      if (reservation.getReservationStatus() == ReserveStatus.LOANED) {
        this.loans += 1;
      }

      if (reservation.getReservationStatus() == ReserveStatus.RETURNED) {
        this.devolutions += 1;
        this.numberItemsReturned += reservation.getItems().size();
      }

      if (reservation.getReservationStatus() == ReserveStatus.CANCELLED
          || reservation.getReservationStatus() == ReserveStatus.WAITING) {
        totalFine = 0;
      }

      this.numberItemsReserved += reservation.getItems().size();
      this.totalFines += totalFine;
    }
  }

  public String toString() {
    return String.format("%s (%d, %d, %d, %d, %d, %f)", user.getName(), loans, devolutions, reserves,
        numberItemsReserved,
        numberItemsReturned, totalFines);
  }
}
