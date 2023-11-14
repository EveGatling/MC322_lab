package library.events;

import library.constants.Event.LibraryEventType;
import library.users.User;
import java.util.List;

public class LibraryEvent {
  private LibraryEventType type;
  protected List<User> members;

  public LibraryEvent(LibraryEventType type) {
    this.type = type;
  }

  public List<User> getMembers() {
    return members;
  }

  public void addMembers(User member) {
    this.members.add(member);
  }

  public LibraryEventType getType() {
    return type;
  }

  public void setType(LibraryEventType type) {
    this.type = type;
  }

}
