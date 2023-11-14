package library.patterns;

import library.media.Ebook;

public class EBookFactory extends ItemMultimedia<Ebook> {
  public Ebook createMedia() {
    return new Ebook(null, null, null, null, null, null, 0, 0, null);
  }
}
