public class Professor extends Employee {
    private String subjectOfExpertise;

    public Professor(int employeeId, String name, double salary, String subjectOfExpertise) {
        super(employeeId, name, salary);
        this.subjectOfExpertise = subjectOfExpertise;
    }
    public String getSubjectOfExpertise() {
        return subjectOfExpertise="Object Oriented Programming";
    }
    public String toString() {
        return super.toString() + "\nSubject of Expertise : " + subjectOfExpertise;
    }
}
