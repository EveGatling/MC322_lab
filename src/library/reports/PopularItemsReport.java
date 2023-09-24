package library.reports;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import library.Library;
import library.media.Media;

class MediaUsageComparator implements java.util.Comparator<MediaUsageReport> {
  public int compare(MediaUsageReport report1, MediaUsageReport report2) {
    return report2.numberTimesReserved - report1.numberTimesReserved;
  }
}

public class PopularItemsReport {
  public List<MediaUsageReport> elements;

  public PopularItemsReport(Library library, int limit) {
    HashMap<Integer, Media> list = library.getMedia();
    Vector<MediaUsageReport> reports = new Vector<>();

    for (HashMap.Entry<Integer, Media> entry : list.entrySet()) {
      reports.add(new MediaUsageReport(entry.getValue()));
    }

    reports.sort(new MediaUsageComparator());
    this.elements = reports.stream().limit(limit).collect(Collectors.toList());
  }

  public String toString() {
    return String.format("%s", elements);
  }
}
