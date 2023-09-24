package library.actions;

public class Reservable {
  protected boolean isAvailable;
  protected int numberTimesReserved = 0;
  protected int numberTimesLoaned = 0;
  protected int numberCopies;
  protected int availableCopies;
  protected int id;

  public Reservable(int id) {
    this.isAvailable = false;
    this.numberTimesLoaned = 0;
    this.numberTimesReserved = 0;
    this.numberCopies = 0;
    this.availableCopies = 0;
    this.id = id;
  }

  public void increaseAvailableCopies() {
    this.availableCopies += 1;

    if (this.availableCopies > 0) {
      this.isAvailable = true;
    }
  }

  public void decreaseAvailableCopies() {
    if (this.availableCopies > 0) {
      this.availableCopies -= 1;
    }

    if (this.availableCopies == 0) {
      this.isAvailable = false;
    }
  }

  public void setAvailableCopies(int availableCopies) {
    this.availableCopies = availableCopies;
    this.isAvailable = availableCopies > 0;
  }

  public boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public int getNumberTimesReserved() {
    return numberTimesReserved;
  }

  public void setNumberTimesReserved(int numberTimesReserved) {
    this.numberTimesReserved = numberTimesReserved;
  }

  public int getNumberTimesLoaned() {
    return numberTimesLoaned;
  }

  public void setNumberTimesLoaned(int numberTimesLoaned) {
    this.numberTimesLoaned = numberTimesLoaned;
  }

  public int getNumberCopies() {
    return numberCopies;
  }

  public void setNumberCopies(int numberCopies) {
    this.numberCopies = numberCopies;
  }

  public int getAvailableCopies() {
    return availableCopies;
  }

  public void increaseTimesReserved() {
    this.numberTimesReserved += 1;
  }

  public void increaseTimesLoaned() {
    this.numberTimesLoaned += 1;
  }

  public int getId() {
    return id;
  }
}
