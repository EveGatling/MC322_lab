package library.rooms;

import java.time.LocalDate;

import library.actions.Reservable;

public class Room extends Reservable {
  private LocalDate reserveDate;
  private int startHour;
  private int endHour;

  public Room(LocalDate reserveDate, int startHour, int endHour, int id) {
    super(id);
    this.reserveDate = reserveDate;
    this.startHour = startHour;
    this.endHour = endHour;
  }

  // Getters and Sectors
  
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
