package library.events;

import library.constants.Event.LibraryEventType;

public class LibraryEvent {
  private LibraryEventType type;

  public LibraryEvent(LibraryEventType type) {
    this.type = type;
  }

  public LibraryEventType getType() {
    return type;
  }

  public void setType(LibraryEventType type) {
    this.type = type;
  }

}
