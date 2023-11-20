package library;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.security.auth.Subject;

import library.actions.Reservation;
import library.auth.Account;
import library.employees.Administrator;
import library.employees.Attendant;
import library.employees.Manager;
import library.equipments.*;
import library.events.*;
import library.media.*;
import library.patterns.CObserver;
import library.patterns.CSingleton;
import library.patterns.EBookFactory;
import library.reflection.CReflect;
import library.reports.*;
import library.rooms.*;
import library.users.*;

public class Runner {
  public static void main(String[] args) {
    Manager manager1 = new Manager(6, "Jeff", 6, "123123");
    Attendant attendant1 = new Attendant(6, "Jeff", 6, "123123");
    Administrator admin1 = new Administrator(6, "Jeff", 6, "123123");

    // Login procedure (permission control)
    Account.login(admin1, "123123");

    // Definition of the main library
    Library library = new Library();

    // Users
    Student student1 = new Student(1, "John", 1, "123123");
    Student student2 = new Student(2, "Caroline", 2, "123123");
    MasterStudent mstudent1 = new MasterStudent(3, "Robert", 3, "123123");
    Professor professor1 = new Professor(4, "Wilson", 4, "123123");
    library.addClient(student1);
    library.addClient(student2);
    library.addClient(mstudent1);
    library.addClient(professor1);
    library.addEmployee(admin1);
    library.addEmployee(manager1);
    library.addEmployee(attendant1);

    // Media
    CD album1 = new CD("X", "BDi", "POP", null, null, null, 2014, 1, "Ed Sheeran", 60);
    CD album2 = new CD("+", "BDi", "POP", null, null, null, 2011, 2, "Ed Sheeran", 60);
    Book book1 = new Book("Call of Cthulhu", null, null, null, null, null, 0, 3, 0, "HP Lovecraft");
    album1.setAvailableCopies(5);
    album2.setAvailableCopies(3);
    book1.setAvailableCopies(10);
    album1.setNumberCopies(7);
    album2.setNumberCopies(3);
    book1.setNumberCopies(11);
    library.addMedia(album1);
    library.addMedia(album2);
    library.addMedia(book1);

    // Equipments
    Informatics laptop = new Informatics("Laptop", 1);
    Printing printer = new Printing("Printer", 2);
    Audiovisual headphones = new Audiovisual("Headphones", 3);
    library.addEquipment(laptop);
    library.addEquipment(printer);
    library.addEquipment(headphones);

    // Rooms
    String[] equipments = { "Projector" };
    SilentRoom room1 = new SilentRoom(10, true, LocalDate.now(), 12, 15, 4);
    GroupRoom room2 = new GroupRoom(equipments, 10, LocalDate.now(), 12, 15, 5);
    IndividualRoom room3 = new IndividualRoom(123, true, LocalDate.now(), 12, 15, 27);
    library.addRoom(room1);
    library.addRoom(room2);
    library.addRoom(room3);

    // Events
    Workshop event1 = new Workshop("John", "Something", equipments, LocalDateTime.now(), "Somewhere");
    Talk event2 = new Talk("John", "Somehthing", LocalDateTime.now(), "Somewhere");
    Expo event3 = new Expo("Something", equipments, 5, "Somehwere");
    library.addEvent(event1);
    library.addEvent(event2);
    library.addEvent(event3);

    // Reservations
    LocalDateTime startFineDate = LocalDateTime.parse("2023-09-04T15:34");
    LocalDateTime endReportDate = LocalDateTime.parse("2023-09-30T15:34");

    Reservation<Room> reservationRoom = student2.createReservation(startFineDate, 10);
    reservationRoom.addItem(room2);

    Reservation<Media> reservation1 = student1.createReservation(startFineDate, 2);
    reservation1.addItem(book1);
    reservation1.addItem(book1);
    reservation1.addItem(album1);

    Reservation<Media> reservation2 = professor1.createReservation(startFineDate, 2);
    reservation2.addItem(book1);
    reservation2.addItem(album2);
    reservation2.addItem(album1);
    reservation2.addItem(album2);
    reservation2.addItem(album2);
    reservation2.addItem(book1);
    reservation2.addItem(book1);
    reservation2.addItem(book1); // This last one fails, more than 7

    library.processFines();

    List<Media> newReservationMediaList = Arrays.asList(book1, album1);
    Reservation<Media> reservation3 = reservation1.renewReservationOfItems(new Vector<Media>(newReservationMediaList),
        12);

    // Reports
    System.out.println("\nUser Role Report:");
    Vector<UserRoleReport> userRoleReport = ReportManager.generateUserRoleReport(library);
    System.out.println(userRoleReport);

    System.out.println("\nFines And Payment Report:");
    Vector<FinesAndPaymentReport> finePaymentReport = ReportManager.generateFinesAndPaymentReport(library);
    System.out.println(finePaymentReport);

    System.out.println("\nItem Popularity Report:");
    PopularItemsReport itemPopularityReport = ReportManager.generatePopularItemsReport(library, 10);
    System.out.println(itemPopularityReport);

    System.out.println("\nMember Activity Report:");
    Vector<MemberActivityReport> memberActivityReport = ReportManager.generateMemberActivityReport(library,
        startFineDate, endReportDate);
    System.out.println(memberActivityReport);

    System.out.println("\nItem Availability Report:");
    Vector<ItemAvailabilityReport> itemAvailabilityReports = ReportManager.generateItemAvailabilityReport(library);
    System.out.println(itemAvailabilityReports);

    System.out.println("\nMedia Usage Report:");
    Vector<MediaUsageReport> mediaUsageReport = ReportManager.generateMediaUsageReport(library);
    System.out.println(mediaUsageReport);

    // Uncomment lines below to print reflection
    // System.out.println("\nMedia Reflection:");
    // System.out.println(Arrays.toString(CReflect.getMediaAttributes(book1)));
    // System.out.println(Arrays.toString(CReflect.getMediaMethods(book1)));
    
    // System.out.println("\nUser Reflection:");
    // System.out.println(Arrays.toString(CReflect.getUserMethods(student1)));
    // System.out.println(Arrays.toString(CReflect.getUserAttributes(student1)));

    // Singleton
    CSingleton mediaManager = CSingleton.getInstance();
    mediaManager.setLibrary(library);
    mediaManager.getMedia();

    // Observer
    CObserver observer = new CObserver(library);
    observer.subscribe(professor1);
    observer.subscribe(student1);
    observer.notifyUsers();
    
    // Factory
    EBookFactory factory = new EBookFactory();
    Ebook ebook = factory.createMedia();
  }
}