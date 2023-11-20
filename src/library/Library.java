package library;

import java.util.Vector;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import library.actions.Reservation;
import library.auth.Account;
import library.equipments.Equipment;
import library.events.LibraryEvent;
import library.media.CD;
import library.media.DVD;
import library.media.Media;
import library.rooms.Room;
import library.users.*;

public class Library {
  private Vector<Employee> employees;
  private Vector<User> clients;
  private HashMap<Integer, Media> media;
  private HashSet<String> categories;

  private Vector<Equipment> equipments;
  private Vector<LibraryEvent> events;
  private Vector<Room> rooms;

  public Library() {
    this.media = new HashMap<Integer, Media>();
    this.employees = new Vector<>();
    this.clients = new Vector<>();
    this.equipments = new Vector<>();
    this.events = new Vector<>();
    this.rooms = new Vector<>();
    this.categories = new HashSet<>();
  }

  /**
   * This method is responsible for processing all fines for all users in the Library.
   * Call this whenever necessary to recalculate all fines.
   */
  public void processFines() {
    if (Account.isNotPermitted("system.reservations.fine")) {
      throw new Error("Not permitted to modify reservations");
    }

    for (User user : this.getUsers()) {
      for (Reservation<?> reservation : user.getReservations()) {
        reservation.calculateFine();
      }
    }
  }

  // Getter and Setters

  public Vector<User> getClients() {
    if (Account.isNotPermitted("system.users.list")) {
      throw new Error("Not allowed to list users");
    }

    return this.clients;
  }

  public HashMap<Integer, Media> getMedia() {
    return this.media;
  }

  public void addMedia(Media media) {
    if (Account.isNotPermitted("system.media.list")) {
      throw new Error("Not allowed to add media");
    }

    for (int key : this.media.keySet()) {
      if (key == media.getId()) {
        throw new Error("Duplicate Identifier");
      }
    }

    if (media instanceof CD || media instanceof DVD) {
      if (((CD) media).getTotalDuration() == 0) {
        throw new Error("Invalid duration");
      }
    }

    this.media.put((Integer) media.getId(), media);
  }

  public Set<String> getCategories() {
    return this.categories;
  }

  public void addCategory(String category) {
    this.categories.add(category);
  }

  public Vector<User> getUsers() {
    if (Account.isNotPermitted("system.users.list")) {
      throw new Error("Not allowed to list users");
    }

    Vector<User> users = new Vector<>();
    users.addAll(this.employees);
    users.addAll(this.clients);
    return users;
  }

  public Vector<Employee> getEmployees() {
    if (Account.isNotPermitted("system.users.list")) {
      throw new Error("Not allowed to list users");
    }

    return this.employees;
  }

  public void addEmployee(Employee employee) {
    if (Account.isNotPermitted("system.users.modify")) {
      throw new Error("Not allowed to modify users");
    }

    this.employees.add(employee);
  }

  public void removeEmployee(int employeeId) {
    if (Account.isNotPermitted("system.users.modify")) {
      throw new Error("Not allowed to modify users");
    }

    this.employees.removeIf(obj -> (obj.getId() == employeeId));
  }

  public void addClient(User client) {
    if (Account.isNotPermitted("system.users.modify")) {
      throw new Error("Not allowed to modify users");
    }

    this.clients.add(client);
  }

  public void removeClient(int clientId) {
    if (Account.isNotPermitted("system.users.modify")) {
      throw new Error("Not allowed to modify users");
    }

    this.clients.removeIf(obj -> (obj.getId() == clientId));
  }

  public void addRoom(Room room) {
    if (Account.isNotPermitted("system.media.modify")) {
      throw new Error("Not allowed to add room");
    }

    this.rooms.add(room);
  }

  public Vector<Room> getRooms() {
    if (Account.isNotPermitted("system.media.list")) {
      throw new Error("Not allowed to list rooms");
    }

    return this.rooms;
  }

  public void addEvent(LibraryEvent event) {
    if (Account.isNotPermitted("system.media.modify")) {
      throw new Error("Not allowed to add events");
    }

    this.events.add(event);
  }

  public Vector<LibraryEvent> getEvents() {
    if (Account.isNotPermitted("system.media.list")) {
      throw new Error("Not allowed to list events");
    }

    return this.events;
  }

  public void addEquipment(Equipment equipment) {
    if (Account.isNotPermitted("system.media.modify")) {
      throw new Error("Not allowed to add equipment");
    }

    this.equipments.add(equipment);
  }

  public Vector<Equipment> getEquipments() {
    if (Account.isNotPermitted("system.media.list")) {
      throw new Error("Not allowed to list equipments");
    }

    return this.equipments;
  }
}
