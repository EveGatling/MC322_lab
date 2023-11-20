package library.reports;

import library.media.Media;

public class ItemAvailabilityReport {
  public int totalAmount;
  public int totalAmountAvailable;
  public Media media;

  // Generate a report on item availability, provided a Media
  public ItemAvailabilityReport(Media media) {
    this.media = media;
    this.totalAmountAvailable = media.getAvailableCopies();
    this.totalAmount = media.getNumberCopies();
  }

  public String toString() {
    return String.format("%s (%d, %d)", media.getTitle(), totalAmount, totalAmountAvailable);
  }
}
