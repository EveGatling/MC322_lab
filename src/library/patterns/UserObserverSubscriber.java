package library.patterns;

import library.users.User;

public class UserObserverSubscriber {
  private User user;

  public UserObserverSubscriber(User user) {
    this.user = user;
  }

  public void notifyMediaAvailable() {
    // Do something here to notify the user!
    return;
  }
}
