package library.auth;

import library.employees.Administrator;
import library.employees.Attendant;
import library.employees.Manager;
import library.users.Employee;

public class Account {
  private static Employee user;
  private static String[] permissions;

  public static boolean checkPermissionKey(String key) {
    if (permissions == null) {
      throw new Error("Undefined permissions for user");
    }

    for (String string : permissions) {
      if (string.equals(key)) {
        return true;
      }
    }

    return false;
  }

  public static boolean isNotPermitted(String key) {
    return !checkPermissionKey(key);
  }

  public static void login(Employee account, String password) {
    if (password.compareTo(account.getPassword()) != 0) {
      throw new Error("Invalid Name/Password");
    }

    user = account;

    if (user instanceof Administrator) {
      permissions = Permission.AdministratorPermissions;
    } else if (user instanceof Attendant) {
      permissions = Permission.AttendantPermissions;
    } else if (user instanceof Manager) {
      permissions = Permission.ManagerPermissions;
    } else {
      throw new Error("Failed to fetch permissions");
    }
  }
}
