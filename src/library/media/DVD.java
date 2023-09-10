package library.media;

import java.util.Vector;

import library.constants.Media.*;

public class DVD extends Media {
	private Vector<String> cast;
	private Vector<String> availableSubtitles;
	private int totalDuration;

	public DVD(String title, String publisher, String genre, String summary, String coverUrl, MediaType type, int year,
			int id) {
		// Essential Attributes
		super(title, publisher, genre, summary, coverUrl, MediaType.DVD, year, id);

		// Additional Attributes
		this.cast = new Vector<String>();
		this.availableSubtitles = new Vector<String>();
		this.totalDuration = 0;

		this.format = MediaFormat.VIDEO;
	}

	// Getters and Setters
	public Vector<String> getCast() {
		return this.cast;
	}

	public void addToCast(String actor) {
		this.cast.add(actor);
	}

	public Vector<String> getAvailableSubtitles() {
		return this.availableSubtitles;
	}

	public void setAvailableSubtitles(String subtitle) {
		this.availableSubtitles.add(subtitle);
	}

	public int getTotalDuration() {
		return this.totalDuration;
	}

	public void setTotalDuration(int totalDuration) {
		this.totalDuration = totalDuration;
	}
}
