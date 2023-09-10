package library.media;

import library.constants.Media.*;

public class Book extends Media {
	// Attributes
	private int edition;
	private int isbn;
	private String author;

	public Book(String title, String publisher, String genre, String summary, String coverUrl, MediaType type, int year,
			int id, int isbn, String author) {
		// Essential Attributes
		super(title, publisher, genre, summary, coverUrl, MediaType.BOOK, year, id);

		this.author = author;
		this.isbn = isbn;
		this.edition = 0;
	}

	public int getEdition() {
		return this.edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public int getIsbn() {
		return this.isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
