package library.actions;

import java.util.List;
import java.util.Vector;

public class LoanList<T extends Reservable> {
  protected List<Reservation<T>> loanList;
  protected int numberLoanedItems;

  public LoanList() {
    this.loanList = new Vector<>();
    this.numberLoanedItems = 0;
  }

  public List<Reservation<T>> getLoanList() {
    return loanList;
  }

  public void setLoanList(List<Reservation<T>> loanList) {
    this.loanList = loanList;
  }

  public int getNumberLoanedItems() {
    return numberLoanedItems;
  }

  public void setNumberLoanedItems(int numberLoanedItems) {
    this.numberLoanedItems = numberLoanedItems;
  }

}
