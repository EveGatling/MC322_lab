package library.multimediacontent;

import library.actions.Reservation;

public class CD extends Media{
	//Attributes
	private String artist;
	private String[] tracks;
	private int numOfCopies;
	private int availableCopies;
	
	//Class Constructor
	public CD(Reservation reservation, String title, String company, String domain, int year, int id, boolean isAvailable, String artist, String[] tracks, int numOfCopies, int availableCopies) {
		super(title, company, domain, year, id, isAvailable, reservation);
		this.artist = artist;
		this.setTracks(tracks);
		this.setNumOfCopies(numOfCopies);
		this.setAvailableCopies(availableCopies);
	}
	
	// Encapsulation (Getters and Setters)
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String[] getTracks(){
		return tracks;
	}

	public void setTracks(String[] tracks){
		this.tracks = tracks;
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
