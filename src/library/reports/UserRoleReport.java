package library.reports;

import java.util.Vector;

import library.actions.Reservation;
import library.constants.Reserve.ReserveStatus;
import library.users.User;

public class UserRoleReport {
  public int numberUsers = 0;
  public double totalReserves = 0;
  public double totalLoans = 0;
  public double averageReserves = 0;
  public double averageLoans = 0;
  public Class<?> role;

  public UserRoleReport(Vector<? extends User> users, Class<?> role) {
    this.role = role;

    for (User user : users) {
      if (role.isInstance(user)) {
        numberUsers += 1;
        totalReserves += user.getReservations().size();

        for (Reservation<?> reservation : user.getReservations()) {
          if (reservation.getStatus() == ReserveStatus.LOANED || reservation.getStatus() == ReserveStatus.RETURNED) {
            totalLoans += 1;
          }
        }
      }
    }

    this.averageLoans = totalLoans / numberUsers;
    this.averageReserves = totalReserves / numberUsers;
  }

  public String toString() {
    return String.format("%s (%f, %f, %f, %f)", role.toString(), totalReserves, totalLoans, averageReserves,
        averageLoans);
  }
}
