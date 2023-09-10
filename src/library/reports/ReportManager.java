package library.reports;

import java.time.LocalDateTime;
import java.util.Vector;

import library.Library;
import library.media.Media;
import library.users.Employee;
import library.users.MasterStudent;
import library.users.Professor;
import library.users.Student;
import library.users.User;

public class ReportManager {
  public static Vector<UserRoleReport> generateUserRoleReport(Library library) {
    UserRoleReport employees = new UserRoleReport(library.getEmployees(), Employee.class);
    UserRoleReport masterStudents = new UserRoleReport(library.getClients(), MasterStudent.class);
    UserRoleReport professors = new UserRoleReport(library.getClients(), Professor.class);
    UserRoleReport students = new UserRoleReport(library.getClients(), Student.class);
    Vector<UserRoleReport> list = new Vector<>(4, 0);
    list.add(employees);
    list.add(masterStudents);
    list.add(professors);
    list.add(students);
    return list;
  }

  public static Vector<MediaUsageReport> generateMediaUsageReport(Library library) {
    Vector<MediaUsageReport> mediaList = new Vector<>();

    for (Media media : library.getMedia()) {
      mediaList.add(new MediaUsageReport(media));
    }

    return mediaList;
  }

  public static PopularItemsReport generatePopularItemsReport(Library library, int limit) {
    return new PopularItemsReport(library, limit);
  }

  public static Vector<MemberActivityReport> generateMemberActivityReport(Library library, LocalDateTime startDate,
      LocalDateTime endDate) {
    Vector<MemberActivityReport> userList = new Vector<>();

    for (User user : library.getUsers()) {
      userList.add(new MemberActivityReport(user, startDate, endDate));
    }

    return userList;
  }

  public static Vector<FinesAndPaymentReport> generateFinesAndPaymentReport(Library library) {
    Vector<FinesAndPaymentReport> userList = new Vector<>();

    for (User user : library.getUsers()) {
      userList.add(new FinesAndPaymentReport(user));
    }

    return userList;
  }

  public static Vector<ItemAvailabilityReport> generateItemAvailabilityReport(Library library) {
    Vector<ItemAvailabilityReport> mediaList = new Vector<>();

    for (Media media : library.getMedia()) {
      mediaList.add(new ItemAvailabilityReport(media));
    }

    return mediaList;
  }
}
