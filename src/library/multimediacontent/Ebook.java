package library.multimediacontent;

import java.time.LocalDate;

import library.actions.Reservation;

public class Ebook extends Media {
	// Attributes
	private String author;
	private int edition;
	private String format;
	private int numberLicenses;
	private String fileFormat;
	private String accessPath;
	private String accessRequirements;
	private LocalDate availabilityDate;

	// Class Constructor
	public Ebook(Reservation reservation, String title, String company, int year, int id, boolean isAvailable,
			String author, String domain, int edition, String format, int numberLicenses, String fileFormat,
			String accessPath, String accessRequirements, LocalDate availabilityDate) {
		super(title, company, domain, year, id, isAvailable, reservation);
		this.author = author;
		this.edition = edition;

		this.format = format;
		this.numberLicenses = numberLicenses;
		this.fileFormat = fileFormat;
		this.accessPath = accessPath;
		this.accessRequirements = accessRequirements;
		this.availabilityDate = availabilityDate;
		this.type = "Ebook";
	}

	// Encapsulation (Getters and Setters)
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

}
