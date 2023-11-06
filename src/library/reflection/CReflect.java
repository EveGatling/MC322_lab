package library.reflection;

import java.lang.reflect.*;

import library.users.User;
import library.actions.Reservation;
import library.media.Media;
import library.rooms.Room;

public class CReflect {
  public static Field[] getUserAttributes(User user) {
    return user.getClass().getDeclaredFields();
  }

  public static Field[] getMediaAttributes(Media media) {
    return media.getClass().getDeclaredFields();
  }

  public static Method[] getMediaMethods(Media media) {
    return media.getClass().getMethods();
  }

  public static Method[] getUserMethods(User user) {
    return user.getClass().getMethods();
  }

  public static void printInformationFor(Media[] mediaList) {
    for (Media media : mediaList) {
      System.out.println(media.getClass().getDeclaredFields());
    }
  }

  public static void printInformationFor(User[] userList) {
    for (User user : userList) {
      System.out.println(user.getClass().getDeclaredFields());
    }
  }

  public static void printInformationFor(Room[] roomList) {
    for (Room room : roomList) {
      System.out.println(room.getClass().getDeclaredFields());
    }
  }

  public static void printInformationFor(Reservation<?>[] reservationList) {
    for (Reservation<?> reservation : reservationList) {
      System.out.println(reservation.getClass().getDeclaredFields());
    }
  }
}
