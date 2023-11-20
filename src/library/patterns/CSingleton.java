package library.patterns;

import java.util.HashMap;

import library.Library;
import library.media.Media;

public class CSingleton {
  private static CSingleton instance;
  private Library library;
  
  private CSingleton() {
    
  }

  public void setLibrary(Library library) {
    this.library = library;
  }

  public HashMap<Integer, Media> getMedia() {
    return this.library.getMedia();
  }

  public static CSingleton getInstance() {
    if (instance == null) {
      instance = new CSingleton();
    }

    return instance;
  }
}
