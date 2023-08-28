package library.multimediacontent;
import library.actions.Reservation;

public class Ebook extends Media{
	//Attributes
    private String author;
    private int edition;

    
    //Class Constructor
    public Ebook(Reservation reservation, String title, String company, int year, int id, boolean isAvailable, String author, String domain, int edition) {
    	super(title, company, domain, year, id, isAvailable, reservation);
        this.setAuthor(author);
        this.setEdition(edition);
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
