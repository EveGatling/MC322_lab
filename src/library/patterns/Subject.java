package library.patterns;

public class Subject {
  private CObserver observer;
  
  public Subject(CObserver observer) {
    this.observer = observer;
  }

  public void notifyObserver() {
    this.observer.notifyUsers();
  }
}
