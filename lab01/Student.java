public class Student {
    private String name;
    private String email;
    private int ra;
    private int[] borrowedBooksIds;

    //Getters
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getRa(){
        return ra;
    }

    public int[] getBorrowedBooksIds(){
        return borrowedBooksIds;
    }


    //Constructor
    public Student(String name, String email, int ra, int[] borrowedBooksIds){
        this.name = name;
        this.email = email;
        this.ra = ra;
        this.borrowedBooksIds = borrowedBooksIds;
    }

    public static void main(String[] args){
        int[] studentBooks = {182938, 782940, 5093840};
        Student thiStudent = new Student("Carlos", "c273819@dac.unicamp.br", 273819, studentBooks);
    }
}
