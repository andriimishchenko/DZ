public class Employee {

    private String name;
    private String number;
    private long salary;

    public Employee(String name, String number, long salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public long getSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " ; " + number + " ; " + salary;
    }
}
