public class Employee {
    String fullName;
    int id;

    public Employee(String fullName, int id){
        this.fullName = fullName;
        this.id = id;
    }

    public static void main(String[] args){
        Employee thisEmployee = new Employee("Jose da Silva", 18293748);
    }
    
}
