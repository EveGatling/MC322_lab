package library.events;

import library.constants.Event.LibraryEventType;

public class LibraryEvent {
  private LibraryEventType type;
  protected List<Members> members;

  public LibraryEvent(LibraryEventType type) {
    this.type = type;
  }

  public List<Members> getMembers(){
    return members;
  }

  public void addMembers(Members member){
    this.members.add(member);
  }

  public LibraryEventType getType() {
    return type;
  }

  public void setType(LibraryEventType type) {
    this.type = type;
  }

}
