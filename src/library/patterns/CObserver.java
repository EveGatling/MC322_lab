package library.patterns;

import java.util.Vector;

import library.Library;
import library.users.User;

public class CObserver {
  private Library library;
  private Vector<UserObserverSubscriber> subscribers;

  public CObserver(Library library) {
    this.library = library;
    this.subscribers = new Vector<>();
  }

  public void notifyUsers() {
    for (UserObserverSubscriber user : this.subscribers) {
        user.notifyMediaAvailable();
    }
  }

  public void subscribe(User user) {
    UserObserverSubscriber subscriber = new UserObserverSubscriber(user);
    this.subscribers.add(subscriber);
  }
}
