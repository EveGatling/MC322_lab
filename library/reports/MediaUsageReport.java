package library.reports;

import library.media.Media;

public class MediaUsageReport {
  public int numberTimesLoaned;
  public int numberTimesReserved;
  public Media media;

  public MediaUsageReport(Media media) {
    this.media = media;
    numberTimesLoaned = media.getNumberTimesLoaned();
    numberTimesReserved = media.getNumberTimesReserved();
  }

  public String toString() {
    return String.format("%s (%d, %d)", media.getTitle(), numberTimesReserved, numberTimesLoaned);
  }
}
