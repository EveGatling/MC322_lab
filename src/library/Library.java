package library;

import java.util.Vector;
import java.util.Map;
import java.util.HashMap;

import library.actions.Reservation;
import library.equipments.Equipment;
import library.events.LibraryEvent;
import library.media.Media;
import library.rooms.Room;
import library.users.*;

public class Library {
  private Vector<Employee> employees;
  private Vector<User> clients;
  private Map<Integer, String> media;
  private Set<String> categories;

  private Vector<Equipment> equipments;
  private Vector<LibraryEvent> events;
  private Vector<Room> rooms;

  public Library() {
    this.media = new HashMap<Integer, String="">();
    this.employees = new Vector<>();
    this.clients = new Vector<>();
    this.equipments = new Vector<>();
    this.events = new Vector<>();
    this.rooms = new Vector<>();
    thid.categories = new Set<>();
  }

  public Vector<User> getClients() {
    return this.clients;
  }

  public Map<Integer, String> getMedia(){
    return this.media;
  }

  public void addMedia(Media media){
    Integer id = media.getId();
    String name = media.getTitle();
    media.put(id, new Media(title, id));
  }

  public Set<String> getCategories(){
    return this.categories;
  }

  public void addCategories(Set<String> categories){
    this.categories.add(categories);
  }

  public Vector<User> getUsers() {
    Vector<User> users = new Vector<>();
    users.addAll(this.employees);
    users.addAll(this.clients);
    return users;
  }

  public Vector<Employee> getEmployees() {
    return this.employees;
  }

  public void processFines() {
    for (User user : this.getUsers()) {
      for (Reservation reservation : user.getReservations()) {
        reservation.calculateFine();
      }
    }
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

  public void addRoom(Room room) {
    this.rooms.add(room);
  }

  public Vector<Room> getRooms() {
    return this.rooms;
  }

  public void addEvent(LibraryEvent event) {
    this.events.add(event);
  }

  public Vector<LibraryEvent> getEvents() {
    return this.events;
  }

  public void addEquipment(Equipment equipment) {
    this.equipments.add(equipment);
  }

  public Vector<Equipment> getEquipments() {
    return this.equipments;
  }
}
