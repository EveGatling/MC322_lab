//Create class
public class book{
    //Attributes
    private String title;
    private String author;
    private String publisher;
    private String domain;
    private int edition;
    private int year;
    private int id;
    private boolean isLate;
    private boolean isBorrowed;


    //Getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }

    public String getDomain(){
        return domain;
    }

    public int getEdition(){
        return edition;
    }

    public int getYear(){
        return year;
    }

    public int getId(){
        return id;
    }

    public Boolean getIsLate(){
        return isLate;
    }

    public Boolean getIsBorrowed(){
        return isBorrowed;
    }

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