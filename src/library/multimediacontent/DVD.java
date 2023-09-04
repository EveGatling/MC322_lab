package library.multimediacontent;

import library.actions.Reservation;

public class DVD extends Media {
	private String[] cast;
	private int totalDuration;
	private String[] availableSubtitles;

	// Class Constructor
	public DVD(String title, String company, String domain, int year, int id, boolean isAvailable,
			Reservation reservation, String[] cast, int totalDuration, int numberCopies, int availableCopies,
			String[] availableSubtitles, PhysicalQuality quality) {
		super(title, company, domain, year, id, isAvailable, reservation);
		this.cast = cast;
		this.totalDuration = totalDuration;
		this.numberCopies = numberCopies;
		this.availableCopies = availableCopies;
		this.availableSubtitles = availableSubtitles;
		this.quality = quality;
		this.type = "DVD";
	}
}
