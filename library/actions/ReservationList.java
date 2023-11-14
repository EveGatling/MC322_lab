package library.actions;

import java.util.List;
import java.util.Vector;

public class ReservationList<T extends Reservable> {
  protected List<Reservation<T>> reservationList;
  protected int numberReservedItems;

  public ReservationList() {
    this.numberReservedItems = 0;
    this.reservationList = new Vector<>();
  }

  public void addReservation(Reservation<T> reservation) {
    numberReservedItems += 1;
    reservationList.add(reservation);
  }

  public List<Reservation<T>> getReservationList() {
    return reservationList;
  }

  public void setReservationList(List<Reservation<T>> reservationList) {
    this.reservationList = reservationList;
  }

  public int getNumberReservedItems() {
    return numberReservedItems;
  }

  public void setNumberReservedItems(int numberReservedItems) {
    this.numberReservedItems = numberReservedItems;
  }
}
