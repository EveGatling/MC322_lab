package library.users;

public class MasterStudent extends User {
  public MasterStudent(int id, String name, String email, int registrationNumber, String phone, String address) {
    super(id, registrationNumber, name, email, phone, address);
  }
}
