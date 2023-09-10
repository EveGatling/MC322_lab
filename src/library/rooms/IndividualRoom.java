package library.rooms;

import java.time.LocalDate;

public class IndividualRoom extends Room {
  private int roomNumber;
  private boolean hasComputer;

  public IndividualRoom(int roomNumber, boolean hasComputer, LocalDate date, int startHour, int endHour) {
    super(date, startHour, endHour);
    this.roomNumber = roomNumber;
    this.hasComputer = hasComputer;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public boolean isHasComputer() {
    return hasComputer;
  }

  public void setHasComputer(boolean hasComputer) {
    this.hasComputer = hasComputer;
  }
}
