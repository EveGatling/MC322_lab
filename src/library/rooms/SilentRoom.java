package library.rooms;

import java.time.LocalDate;

public class SilentRoom extends Room {
  private int capacity;
  private boolean hasIndividualSeats;

  public SilentRoom(int capacity, boolean hasIndividualSeats, LocalDate date, int startHour, int endHour) {
    super(date, startHour, endHour);
    this.capacity = capacity;
    this.hasIndividualSeats = hasIndividualSeats;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public boolean isHasIndividualSeats() {
    return hasIndividualSeats;
  }

  public void setHasIndividualSeats(boolean hasIndividualSeats) {
    this.hasIndividualSeats = hasIndividualSeats;
  }
}
