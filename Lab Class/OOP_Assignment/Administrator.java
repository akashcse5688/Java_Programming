public class Administrator extends Employee {
    private String department;

    public Administrator(int employeeId, String name, double salary, String department) {
        super(employeeId, name, salary);
        this.department = department;
    }
    public String getDepartment() {
        return department="Computer Science and Engineering";
    }
    public String toString() {
        return super.toString() + "\nDepartment: " + department;
    }
}
