public class Student {
    String name;
    String email;
    int ra;
    int[] borrowedBooksIds;


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
