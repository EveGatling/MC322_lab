//Create class
public class book{
    String title;
    String author;
    String publisher;
    String domain;
    int edition;
    int year;
    int id;
    boolean isLate;
    boolean isBorrowed;

    //Class Constructor
    public book(String title, String author, String publisher, String domain,int edition, int year, int id, boolean isLate, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.domain = domain;
        this.edition = edition;
        this.year = year;
        this.id = id;
        this.isLate = isLate;
        this.isBorrowed = isBorrowed;
    }

    //Create object
    public static void main(String[] args){
        book thisBook = new book("Red Queen", "Victoria Aveyard", "Orion", "fiction", 3, 2015, 273617, false, true);
    }
}