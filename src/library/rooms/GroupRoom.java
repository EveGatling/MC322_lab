package library.rooms;

import java.time.LocalDate;

public class GroupRoom extends Room {
  private int capacity;
  private String[] equipment;

  public GroupRoom(String[] equipment, int capacity, LocalDate date, int startHour, int endHour, int id) {
    super(date, startHour, endHour, id);
    this.equipment = equipment;
    this.capacity = capacity;
  }

  // Getters and Sectors

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public String[] getEquipment() {
    return equipment;
  }

  public void setEquipment(String[] equipment) {
    this.equipment = equipment;
  }
}
