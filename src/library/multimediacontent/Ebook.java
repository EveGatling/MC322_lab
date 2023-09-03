package library.multimediacontent;
import library.actions.Reservation;

public class Ebook extends Media{
	//Attributes
    private String author;
    private int edition;
	private String format; //PDF, Epub...
	private int numOfLicenses;
	private String url;

    
    //Class Constructor
    public Ebook(Reservation reservation, String title, String company, int year, int id, boolean isAvailable, String author, String domain, int edition, String format, int numOfLicenses, String url) {
    	super(title, company, domain, year, id, isAvailable, reservation);
        this.setAuthor(author);
        this.setEdition(edition);
		this.setFormat(format);
		this.setNumOfLicenses(numOfLicenses);
		this.setUrl(url);
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

	public String getFormat(){
		return format;
	}

	public void setFormat(String format){
		this.format = format;
	}

	public int getNumOfLicenses(){
		return numOfLicenses;
	}

	public void setNumOfLicenses(int numOfLicenses){
		this.numOfLicenses = numOfLicenses;
	}

	public String getUrl(){
		return url;
	}

	public void setUrl(String url){
		this.url = url;
	}

}
