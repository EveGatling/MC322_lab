package library.multimediacontent;

import library.actions.Reservation;

public class CD extends Media {
	// Attributes
	private String artist;
	private String[] records;
	private int totalDuration;

	// Class Constructor
	public CD(Reservation reservation, String title, String company, String domain, int year, int id, boolean isAvailable,
			String artist, String[] records, int totalDuration, int numberCopies, PhysicalQuality quality) {
		super(title, company, domain, year, id, isAvailable, reservation);
		this.artist = artist;
		this.records = records;
		this.totalDuration = totalDuration;
		this.type = "CD";
	}

	// Encapsulation (Getters and Setters)
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

}
