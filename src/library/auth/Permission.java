package library.auth;

public final class Permission {
  static String[] AdministratorPermissions = {
      "system.users.list",
      "system.users.modify",
      "system.media.list",
      "system.media.modify",
      "system.reservations.process",
      "system.loans.process",
      "system.reservations.list",
      "system.reservations.modify",
      "system.reservations.fine",
      "system.report.generate",
      "system.global.read",
      "system.global.modify",
  };

  static String[] AttendantPermissions = {
      "system.users.list",
      "system.media.read",
      "system.reservations.list",
      "system.reservations.modify",
  };

  static String[] ManagerPermissions = {
      "system.users.list",
      "system.users.modify",
      "system.media.read",
      "system.reservations.list",
      "system.reservations.modify",
      "system.report.generate",
      "system.global.read",
      "system.global.modify",
  };
}