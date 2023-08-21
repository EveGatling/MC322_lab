public class Library {
    private book[] allBooks; //Stores and creates books
    private String[] domains;
    private Employee[] employees; //Stores and creates employees

    public book[] getAllBooks(){
        return allBooks;
    }

    public String[] getDomains(){
        return domains;
    }

    public Employee[] getEmployees(){
        return employees;
    }

    public Library(book[] allBooks, String[] domains, Employee[] employees){
        this.allBooks = allBooks;
        this.domains = domains;
        this.employees = employees;
    }

    public static void main(String[] args){
        book[] books = {new book("Harry Potter", "J K Rowling", "Editora", "Fiction", 5, 1997, 485762, false, false)};
        String[] domains = {"Fiction", "Computer Science", "History", "Kids"};
        Employee[] employees = {new Employee("Roberto da Silva", 38492827)};
        Library thisLibrary = new Library(books, domains,employees);
    }
}