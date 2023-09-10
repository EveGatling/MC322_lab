package library.events;

import java.time.LocalDateTime;

import library.constants.Event.LibraryEventType;

public class Talk extends LibraryEvent {
  private String instructorName;
  private String topic;
  private LocalDateTime datetime;
  private String local;

  public Talk(String instructorName, String topic, LocalDateTime datetime, String local) {
    super(LibraryEventType.TALK);
    this.instructorName = instructorName;
    this.topic = topic;
    this.datetime = datetime;
    this.local = local;
  }

  public String getInstructorName() {
    return instructorName;
  }

  public void setInstructorName(String instructorName) {
    this.instructorName = instructorName;
  }

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public LocalDateTime getDatetime() {
    return datetime;
  }

  public void setDatetime(LocalDateTime datetime) {
    this.datetime = datetime;
  }

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
  }
}
