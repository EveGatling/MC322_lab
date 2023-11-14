package library.users;

public class MasterStudent extends User {
  public MasterStudent(int id, String name, int registrationNumber, String password) {
    this(id, name, null, registrationNumber, null, null, password);
  }

  public MasterStudent(int id, String name, String email, int registrationNumber, String phone, String address,
      String password) {
    super(id, registrationNumber, name, email, phone, address, password);
  }
}
