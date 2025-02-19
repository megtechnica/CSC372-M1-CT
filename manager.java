public class Manager extends Employee {
    // Fields
    private String department;

    // Constructor
    public Manager() {
        super(); // Call the superclass (Employee) constructor
        this.department = ""; // Initialize department to empty string
    }

    // Setter and Getter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Override employeeSummary method
    @Override
    public void employeeSummary() {
        super.employeeSummary(); // Call the superclass method to print employee details
        System.out.println("Department: " + department);
    }
}
