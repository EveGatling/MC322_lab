package library.multimediacontent;
import library.actions.Reservation;
import library.users.User;

public class Media {
	//Attributes
	
	protected String title;
	protected String company;
    protected String domain;
	protected int year;
	protected int id;
	protected boolean isAvailable;
	protected Reservation reservation; // -> implement list
    
	//Constructor 
    public Media(String title, String company, String domain, int year, int id, boolean isAvailable, Reservation reservation){
    	this.title = title;
    	this.company = company;
    	this.year = year;
    	this.id = id;
    	this.isAvailable = isAvailable;
        this.domain = domain;
        this.reservation = null;
    }
    
    //Methods
    public void createReservation(User user) {
    	//Reservation newReservation = new reservation();
    	setReservation(reservation);
    	user.setReservation(reservation);
    }
    
    
    // Encapsulation (Getters and Setters)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
