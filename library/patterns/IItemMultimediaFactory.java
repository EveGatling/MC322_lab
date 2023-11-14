package library.patterns;

import library.media.Media;

public interface IItemMultimediaFactory<T extends Media> {
  public T createMedia();
}
