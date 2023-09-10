package library.employees;

import library.users.Employee;

public class Administrator extends Employee {

	public Administrator(int id, String name, int registrationNumber) {
		this(id, name, null, registrationNumber, null, null);
	}

	public Administrator(int id, String name, String email, int registrationNumber, String phone, String address) {
		super(id, name, email, registrationNumber, phone, address);
	}

}
