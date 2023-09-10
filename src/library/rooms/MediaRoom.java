package library.rooms;

import java.time.LocalDate;

public class MediaRoom extends Room {
  private String[] equipment;

  public MediaRoom(String[] equipment, LocalDate date, int startHour, int endHour) {
    super(date, startHour, endHour);
    this.equipment = equipment;
  }

  public String[] getEquipment() {
    return equipment;
  }

  public void setEquipment(String[] equipment) {
    this.equipment = equipment;
  }
}
