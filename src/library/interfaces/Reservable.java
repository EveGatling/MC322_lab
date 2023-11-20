package library.interfaces;

public interface Reservable {
  void increaseAvailableCopies();
  void decreaseAvailableCopies();
  void setAvailableCopies();
  void getAvailableCopies();
  void getIsAvailable();
}
