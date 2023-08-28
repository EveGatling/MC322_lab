package library.actions;
import java.util.Calendar;
import java.util.Date;

import library.multimediacontent.Media;
import library.users.User;

public class Reservation {
	    //Attributes
	    private User user;
	    private Media media;
	    private Date beginningDate;
	    private Date endingDate;
	    
	    //Methods 
	    public void endingReservation(Media media) {
	    	//Dúvida: como apagar um objeto?
	    	media.setReservation(null);
	    	media.setAvailable(true);
	    }
	    
	    public void startReservation(Reservation reservation, Date beginningDate) {
	    	reservation.setBeginningDate(beginningDate);
	    	
	    	//criar procedimento para mandar e-mail ao usuário informando o prazo para empréstimo do item
	    }
	    
	    //Class Constructor 
	    public Reservation(Media media, User user) {
	    	this.media = media;
	    	this.user = user;
	    }
	    
		// Encapsulation (Getters and Setters)
		public Media getMedia() {
			return media;
		}
		public void setMedia(Media media) {
			this.media = media;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Date getBeginningDate() {
			return beginningDate;
		}
		public void setBeginningDate(Date beginningDate) {
			this.beginningDate = beginningDate;
			
			Date data = beginningDate;
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(data);
	        calendar.add(Calendar.DAY_OF_YEAR, 3);
	        setEndingDate(calendar.getTime());
		}
		public Date getEndingDate() {
			return endingDate;
		}
		public void setEndingDate(Date endingDate) {
			this.endingDate = endingDate;
		}

}
