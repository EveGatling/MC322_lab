package library.rooms;

import library.constants.Room.ReserveStatus;

public class ReservedRoom {
  public Room room;
  public ReserveStatus status;

  public ReservedRoom(Room room) {
    this.room = room;
    this.status = ReserveStatus.PENDING;
  }
}
