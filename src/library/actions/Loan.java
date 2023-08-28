package library.actions;
import java.util.Date;
import java.util.Calendar;
import library.multimediacontent.Media;
import library.users.User;

public class Loan {
	//Attributes
	private Media media;
	private User user;
	private Date loanDate;
	private Date expectedDate;
	private Date returnDate;
	
	//Class Constructor
	public Loan(Media media, User user, Date loanDate) {
		this.media = media;
		this.user = user;
		setLoanDate(loanDate);
	}
	
	//Methods
	public static Date renewLoan(Loan loan) {
		Date data = loan.getExpectedDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.WEEK_OF_YEAR, 1);
        return calendar.getTime();
    }
	
	public void devolution(Loan loan, Date todayDate) {
		if(loan.getMedia().getReservation() != null) {
			Reservation reservation = loan.getMedia().getReservation();
			reservation.startReservation(reservation, todayDate);
		}
		
		else {
			Media media = loan.getMedia();
			media.setAvailable(true);
			
			User user = loan.getUser();
			user.setLoan(null);
		}
		
		
		//Dúvida: como apagar um objeto?
	}
	

	// Encapsulation (Getters and Setters)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Media getMedia() {
		return media;
	}
	public void setMedia(Media media) {
		this.media = media;
	}
	public Date getExpectedDate() {
		return expectedDate;
	}
	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Date getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
		
		Date data = loanDate;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.WEEK_OF_YEAR, 1);
        setExpectedDate(calendar.getTime());
	}
	
	// MAIN
	public static void main(String[] args) {
		
	}
	
}
