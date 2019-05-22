import java.util.Arrays;

public class Company {
    private String name;
    private String address;
    private String number;
    private Employee[] employees;

    public Company(String name, String address, String number, Employee[] employees) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.employees = employees;
    }

    public void maxSalaryEmployeeName(){

            long max=0;
            String maxSalaryEmployeeName="";
            for (Employee employees:employees){
                if (employees.getSalary()==max){
                    maxSalaryEmployeeName=maxSalaryEmployeeName+", "+employees.getName();
                }
                if (employees.getSalary()>max){
                    max=employees.getSalary();
                    maxSalaryEmployeeName=employees.getName();
                }
            }
        System.out.print(maxSalaryEmployeeName);



        }


        public Employee[] addEmployee(Employee newEmployee) {
            if(newEmployee.getSalary()>=320L) {
                for (int i = 0; i < this.employees.length; i++) {
                    if (this.employees[i] == null) {
                        this.employees[i] = newEmployee;
                        return employees;
                    }
                }
                this.employees = Arrays.copyOf(this.employees, employees.length + 1);
                this.employees[this.employees.length - 1] = newEmployee;
            }
        return employees;
        }


     public Employee[] deleteEmployee(Employee employee) {
         for (int i = 0; i < this.employees.length; i++) {
             if (this.employees[i] == null) {
                 System.out.println("No emloyees!");
                 return employees;
             } else if (this.employees[i] == employee) {
                 this.employees[i] = null;
                 this.employees = Arrays.copyOf(this.employees, employees.length - 1);
                 return employees;
             }
         }
         return employees;
     }

    public void commonSalary(){
        long commonSalary=0;
        for (Employee employees:employees){
            commonSalary+=employees.getSalary();
        }
        System.out.println(commonSalary);
    }

    public void averageSalary(){
        long commonSalary=0;
        int count=0;
        for (Employee employees:employees){
            commonSalary+=employees.getSalary();
            count++;
        }
        System.out.println(commonSalary/count);
    }

    public void showEmployees(){
        System.out.println(this);
    }



    @Override
    public String toString() {
        return "Company [Employees=" + Arrays.toString(employees) + "]";
    }
}
