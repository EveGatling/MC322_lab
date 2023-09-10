package library.reports;

import java.util.Vector;

import library.media.Media;

public class MediaUsageReport {
  public int numberTimesLoaned;
  public int numberTimesReserved;
  public Media media;

  public MediaUsageReport(Media media) {
    this.media = media;
    numberTimesLoaned = media.getTimesLoaned();
    numberTimesReserved = media.getTimesReserved();
  }

  public String toString() {
    return String.format("%s (%d, %d)", media.getTitle(), numberTimesReserved, numberTimesLoaned);
  }
}
