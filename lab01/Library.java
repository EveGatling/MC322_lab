public class Library {
    book[] allBooks;//Stores all books that belong to the library by ID
    String[] domains;
    int[] employees; //Stores all employees by ID

    public Library(book[] allBooks, String[] domains, int[] employees){
        this.allBooks = allBooks;
        this.domains = domains;
        this.employees = employees;
    }

    public static void main(String[] args){
        book[] books = {new book("Harry Potter", "J K Rowling", "Editora", "Fiction", 5, 1997, 485762, false, false)};
        String[] domains = {"Fiction", "Computer Science", "History", "Kids"};
        int[] employees = {18293748, 3829403};
        Library thisLibrary = new Library(books, domains,employees);
    }
}
