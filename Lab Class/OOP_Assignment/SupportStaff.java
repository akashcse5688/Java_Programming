public class SupportStaff extends Employee {
    private String jobTitle;

    public SupportStaff(int employeeId, String name, double salary, String jobTitle) {
        super(employeeId, name, salary);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle = "Assistant";
    }
    public String toString() {
        return super.toString() + "\nJob Title: " + jobTitle;
    }
}
