package library.rooms;

import java.time.LocalDate;

public class Room {
  private LocalDate reserveDate;
  private int startHour;
  private int endHour;

  public Room(LocalDate reserveDate, int startHour, int endHour) {
    this.reserveDate = reserveDate;
    this.startHour = startHour;
    this.endHour = endHour;
  }

  public LocalDate getReserveDate() {
    return reserveDate;
  }

  public void setReserveDate(LocalDate reserveDate) {
    this.reserveDate = reserveDate;
  }

  public int getStartHour() {
    return startHour;
  }

  public void setStartHour(int startHour) {
    this.startHour = startHour;
  }

  public int getEndHour() {
    return endHour;
  }

  public void setEndHour(int endHour) {
    this.endHour = endHour;
  }
}
