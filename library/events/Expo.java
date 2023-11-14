package library.events;

import library.constants.Event.LibraryEventType;

public class Expo extends LibraryEvent {
  protected String theme;
  protected String[] exhibitors;
  protected int duration;
  protected String local;

  public Expo(String theme, String[] exhibitors, int duration, String local) {
    super(LibraryEventType.EXPO);
    this.theme = theme;
    this.exhibitors = exhibitors;
    this.duration = duration;
    this.local = local;
  }

  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public String[] getExhibitors() {
    return exhibitors;
  }

  public void setExhibitors(String[] exhibitors) {
    this.exhibitors = exhibitors;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

}
