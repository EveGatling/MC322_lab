package library.media;

import java.util.List;
import java.util.Vector;

public class LibraryItem<T extends Media> {
  protected List<T> reservedItems;
  protected List<T> loanedItems;
  protected int numberReservedItems;
  protected int numberLoanedItems;

  public LibraryItem() {
    this.reservedItems = new Vector<>();
    this.loanedItems = new Vector<>();
    this.numberReservedItems = 0;
    this.numberLoanedItems = 0;
  }

  public boolean reserveItem(T item) {
    for (T media : reservedItems) {
      if (item.getId() == media.getId()) {
        this.numberReservedItems += 1;
        media.decreaseAvailableCopies();
        return true;
      }
    }

    return false;
  }

  public boolean loanItem(T item) {
    for (T media : reservedItems) {
      if (item.getId() == media.getId()) {
        this.numberReservedItems -= 1;
        this.numberLoanedItems += 1;
        reservedItems.removeIf(el -> el.getId() == item.getId());
        loanedItems.add(media);
        return true;
      }
    }

    return false;
  }

  public void returnItem(T item) {
    for (T media : reservedItems) {
      this.numberLoanedItems -= 1;
      loanedItems.removeIf(el -> el.getId() == item.getId());
      media.increaseAvailableCopies();
    }
  }

  public List<T> getReservedItems() {
    return reservedItems;
  }

  public void setReservedItems(List<T> reservedItems) {
    this.reservedItems = reservedItems;
  }

  public List<T> getLoanedItems() {
    return loanedItems;
  }

  public void setLoanedItems(List<T> loanedItems) {
    this.loanedItems = loanedItems;
  }

  public int getNumberReservedItems() {
    return numberReservedItems;
  }

  public void setNumberReservedItems(int numberReservedItems) {
    this.numberReservedItems = numberReservedItems;
  }

  public int getNumberLoanedItems() {
    return numberLoanedItems;
  }

  public void setNumberLoanedItems(int numberLoanedItems) {
    this.numberLoanedItems = numberLoanedItems;
  }
}
