package library.reports;

import java.time.LocalDate;

import library.actions.Reservation;
import library.constants.Reserve.ReserveStatus;
import library.users.User;

public class MemberActivityReport {
  public int loans;
  public int devolutions;
  public int reserves;
  public int numberItemsReserved;
  public int numberItemsReturned;
  public int totalFines;

  public MemberActivityReport(User user, LocalDate startDate, LocalDate endDate) {
    if (user == null) {
      throw new Error("Failured to generate report for null user");
    }

    for (Reservation reservation : user.getReservations()) {
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
        this.numberItemsReturned += reservation.getMedia().size();
      }

      if (reservation.getReservationStatus() == ReserveStatus.CANCELLED
          || reservation.getReservationStatus() == ReserveStatus.WAITING) {
        totalFine = 0;
      }

      this.numberItemsReserved += reservation.getMedia().size();
      this.totalFines += totalFine;
    }
  }
}
