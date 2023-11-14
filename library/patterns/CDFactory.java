package library.patterns;

import library.media.CD;

public class CDFactory extends ItemMultimedia<CD> {
  public CD createMedia() {
    return new CD(null, null, null, null, null, null, 0, 0, null, 0);
  }
}
