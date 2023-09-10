package library.events;

import java.time.LocalDateTime;

import library.constants.Event.LibraryEventType;

public class Workshop extends LibraryEvent {
  private String instructorName;
  private String topic;
  private String[] requiredMaterials;
  private LocalDateTime dateTime;
  private String local;

  public Workshop(String instructorName, String topic, String[] requiredMaterials,
      LocalDateTime dateTime, String local) {
    super(LibraryEventType.WORKSHOP);
    this.instructorName = instructorName;
    this.topic = topic;
    this.requiredMaterials = requiredMaterials;
    this.dateTime = dateTime;
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

  public String[] getRequiredMaterials() {
    return requiredMaterials;
  }

  public void setRequiredMaterials(String[] requiredMaterials) {
    this.requiredMaterials = requiredMaterials;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

}
