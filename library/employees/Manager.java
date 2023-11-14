package library.employees;

import library.users.Employee;

public class Manager extends Employee {
	public Manager(int id, String name, int registrationNumber, String password) {
		this(id, name, null, registrationNumber, null, null, password);
	}

	public Manager(int id, String name, String email, int registrationNumber, String phone, String address,
			String password) {
		super(id, name, email, registrationNumber, phone, address, password);
	}
}
