package library;

import java.util.Vector;

import library.media.Media;
import library.users.*;

public class Library {
  private Vector<Media> media;
  private Vector<Employee> employees;
  private Vector<User> clients;

  public Library() {
    this.media = new Vector<>();
    this.employees = new Vector<>();
    this.clients = new Vector<>();
  }

  public Vector<Media> getMedia() {
    return media;
  }

  public void addMedia(Media media) {
    this.media.add(media);
  }

  public void removeMedia(int mediaId) {
    this.media.removeIf(obj -> (obj.getId() == mediaId));
  }

  public void addEmployee(Employee employee) {
    this.employees.add(employee);
  }

  public void removeEmployee(int employeeId) {
    this.employees.removeIf(obj -> (obj.getId() == employeeId));
  }

  public void addClient(User client) {
    this.clients.add(client);
  }

  public void removeClient(int clientId) {
    this.clients.removeIf(obj -> (obj.getId() == clientId));
  }
}
