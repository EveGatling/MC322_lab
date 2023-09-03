package library.multimediacontent;

import library.actions.Reservation;

public class DVD extends Media{

	public float duration; // 1.5 hours
	//Class Constructor
	public DVD(String title, String company, String domain, int year, int id, boolean isAvailable, Reservation reservation, float duration) {
		super(title, company, domain, year, id, isAvailable, reservation);
		this.duration = duration;
	}
}
