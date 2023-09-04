package library.multimediacontent;

import library.actions.Reservation;

enum PhysicalQuality {
	HIGHLY_DAMAGED,
	SOFTLY_DAMAGED,
	GOOD,
	EXCELENT
}

public class Book extends Media {
	// Attributes
	private int edition;
	private int isbn;
	private String author;

	// Class Constructor
	public Book(Reservation reservation, String title, String company, int year, int id, boolean isAvailable,
			String author, String domain, int edition, int numberCopies, String locationShelf, String locationBookcase,
			PhysicalQuality quality, int isbn) {
		super(title, company, domain, year, id, isAvailable, reservation);

		this.author = author;
		this.edition = edition;
		this.numberCopies = numberCopies;
		this.locationBookcase = locationBookcase;
		this.locationShelf = locationShelf;
		this.quality = quality;
		this.isbn = isbn;
		this.type = "Book";
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
