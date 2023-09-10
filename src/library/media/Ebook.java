package library.media;

import java.time.LocalDateTime;

import library.constants.Media.*;

public class Ebook extends Media {
	// Attributes
	private String author;
	private int edition;
	private int numberLicenses;
	private String fileFormat;
	private String accessPath;
	private String accessRequirements;
	private LocalDateTime availabilityDate;

	public Ebook(String title, String publisher, String genre, String summary, String coverUrl, MediaType type, int year,
			int id, String author) {
		// Essential Attributes
		super(title, publisher, genre, summary, coverUrl, MediaType.EBOOK, year, id);

		this.author = author;
		this.numberLicenses = 0;
		this.fileFormat = ".pdf";
		this.accessPath = null;
		this.accessRequirements = null;
		this.availabilityDate = LocalDateTime.now();

		this.format = MediaFormat.SOFTWARE;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getEdition() {
		return this.edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public int getNumberLicenses() {
		return this.numberLicenses;
	}

	public void setNumberLicenses(int numberLicenses) {
		this.numberLicenses = numberLicenses;
	}

	public String getFileFormat() {
		return this.fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public String getAccessPath() {
		return this.accessPath;
	}

	public void setAccessPath(String accessPath) {
		this.accessPath = accessPath;
	}

	public String getAccessRequirements() {
		return this.accessRequirements;
	}

	public void setAccessRequirements(String accessRequirements) {
		this.accessRequirements = accessRequirements;
	}

	public LocalDateTime getAvailabilityDate() {
		return this.availabilityDate;
	}

	public void setAvailabilityDate(LocalDateTime availabilityDate) {
		this.availabilityDate = availabilityDate;
	}
}
