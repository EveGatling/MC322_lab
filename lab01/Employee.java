public class Employee {
    private String fullName;
    private int id;

    //Getters
    public String getFullName(){
        return fullName;
    }

    public int getId(){
        return id;
    }

    //Setters
    public Employee(String fullName, int id){
        this.fullName = fullName;
        this.id = id;
    }

    public static void main(String[] args){
        Employee thisEmployee = new Employee("Jose da Silva", 18293748);
    }
    
}
