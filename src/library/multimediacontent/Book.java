package library.multimediacontent;
import library.actions.Reservation;

public class Book extends Media{
    //Attributes
    private String author;
    private int edition;
	private int isbn;
	private int bookshelf;
	private int shelf;
    
    //Class Constructor
    public Book(Reservation reservation, String title, String company, int year, int id, boolean isAvailable, String author, String domain, int edition, int isbn, int bookshelf, int shelf) {
    	super(title, company, domain, year, id, isAvailable, reservation);
        this.setAuthor(author);
        this.setEdition(edition);
		this.setBookshelf(bookshelf);
		this.setShelf(shelf);
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

	public int getIsbn(){
		return isbn;
	}

	public void setIsbn(int isbn){
		this.isbn = isbn;
	}

	public int getBookshelf(){
		return bookshelf;
	}

	public void setBookshelf(int bookshelf){
		this.bookshelf = bookshelf;
	}

	public int getShelf(){
		return shelf;
	}

	public void setShelf(int shelf){
		this.shelf = shelf;
	}
	
	// MAIN
		public static void main(String[] args) {
			
		}
}


