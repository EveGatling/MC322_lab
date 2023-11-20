package library.rooms;

import java.time.LocalDate;

public class MediaRoom extends Room {
  private String[] equipment;

  public MediaRoom(String[] equipment, LocalDate date, int startHour, int endHour, int id) {
    super(date, startHour, endHour, id);
    this.equipment = equipment;
  }

  // Getters and Sectors

  public String[] getEquipment() {
    return equipment;
  }

  public void setEquipment(String[] equipment) {
    this.equipment = equipment;
  }
}
