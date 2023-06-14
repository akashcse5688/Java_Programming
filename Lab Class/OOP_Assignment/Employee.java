import java.util.ArrayList;
public class Employee{

    private int employeeId;
    private String name;
    private double salary;
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
    public Employee() {
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String toString() {
        return "Employee ID : " + employeeId + "\nEmployee Name : " + name + "\nSalary : " + salary+" BDT";
    }

    public static double totalSalary(ArrayList<Employee> Employees) {
        double totalSalary = 0;
        for (Employee employee : Employees) {
            totalSalary += employee.salary;
        }
        return totalSalary;
    }
}
