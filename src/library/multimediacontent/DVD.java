package library.multimediacontent;

import library.actions.Reservation;

public class DVD extends Media{

	public float duration; // 1.5 hours
	private int numOfCopies;
	private int availableCopies;


	//Class Constructor
	public DVD(String title, String company, String domain, int year, int id, boolean isAvailable, Reservation reservation, float duration, int numOfCopies, int availableCopies) {
		super(title, company, domain, year, id, isAvailable, reservation);
		this.duration = duration;
		this.setNumOfCopies(numOfCopies);
		this.setAvailableCopies(availableCopies);
	}

	public int getNumOfCopies(){
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies){
		this.numOfCopies = numOfCopies;
	}

	public int getAvailableCopies(){
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies){
		this.availableCopies = availableCopies;
	}
}
