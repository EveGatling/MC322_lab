package library.constants;

import library.users.*;

public class Reserve {
  public static enum ReserveStatus {
    LOANED,
    WAITING,
    CANCELLED,
    RETURNED
  }

  public static int getReserveTimeLimit(User user) {
    if (user instanceof Student)
      return 15;
    else if (user instanceof MasterStudent)
      return 20;
    else if (user instanceof Professor)
      return 30;
    else if (user instanceof Employee)
      return 20;
    else
      return 0;
  }

  public static double getReserveFine(User user) {
    if (user instanceof Student)
      return 1;
    else if (user instanceof MasterStudent)
      return 1;
    else if (user instanceof Professor)
      return 0.5;
    else if (user instanceof Employee)
      return 0.75;
    else
      return 0;
  }

  public static int getReserveAmountLimit(User user) {
    if (user instanceof Student)
      return 3;
    else if (user instanceof MasterStudent)
      return 5;
    else if (user instanceof Professor)
      return 7;
    else if (user instanceof Employee)
      return 4;
    else
      return 0;
  }
}
