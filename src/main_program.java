import java.io.IOException;
import java.util.Scanner;

public class main_program {
    public static void main(String[] args) throws IOException {
        Employee employee1=new Employee("Ivan", "0737767766",1000);
        Employee employee2=new Employee("Pavlo", "0737342766",3000);
        Employee employee3=new Employee("Serhii", "0984366766",78000);
        Company gl=new Company("GlobalLogic", "Hrinchenka 2/1", "0442356577", new Employee[]{employee1, employee2, employee3});
        //gl.maxSalaryEmployeeName();

        Employee employee4=new Employee("Andrii", "0997767766",1500);

        gl.addEmployee(employee4);
        gl.showEmployees();

        gl.deleteEmployee(employee4);
        gl.showEmployees();

        gl.commonSalary();
        gl.averageSalary();
    }
}

