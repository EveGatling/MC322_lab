package library.patterns;

import library.media.Media;

public abstract class ItemMultimedia<T extends Media> implements IItemMultimediaFactory<T> {
  public abstract T createMedia();
}
