package library.rooms;

import java.time.LocalDate;

public class IndividualRoom extends Room {
  private int roomNumber;
  private boolean hasComputer;

  public IndividualRoom(int roomNumber, boolean hasComputer, LocalDate date, int startHour, int endHour, int id) {
    super(date, startHour, endHour, id);
    this.roomNumber = roomNumber;
    this.hasComputer = hasComputer;
  }

  // Getters and Sectors

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
