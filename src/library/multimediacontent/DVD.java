package library.multimediacontent;

import library.actions.Reservation;

public class DVD extends Media{
	//Class Constructor
	public DVD(String title, String company, String domain, int year, int id, boolean isAvailable, Reservation reservation) {
		super(title, company, domain, year, id, isAvailable, reservation);
	}
}
