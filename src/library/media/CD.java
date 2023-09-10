package library.media;

import java.util.Vector;

import library.constants.Media.*;

public class CD extends Media {
	// Attributes
	private String artist;
	private Vector<String> records;
	private int totalDuration;

	// Class Constructor
	public CD(String title, String publisher, String genre, String summary, String coverUrl, MediaType type, int year,
			int id, String artist) {
		// Essential Attributes
		super(title, publisher, genre, summary, coverUrl, MediaType.CD, year, id);

		// Additional Attributes
		this.artist = artist;
		this.records = new Vector<String>();
		this.totalDuration = 0;
	}

	public String getArtist() {
		return this.artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Vector<String> getRecords() {
		return this.records;
	}

	public void setRecords(String record) {
		this.records.add(record);
	}

	public int getTotalDuration() {
		return this.totalDuration;
	}

	public void setTotalDuration(int totalDuration) {
		this.totalDuration = totalDuration;
	}
}
