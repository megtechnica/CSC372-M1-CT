public class Test {
    public static void main(String[] args) {
        // Creating an Employee object and setting values
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setEmployeeID(101);
        employee.setSalary(50000.0);
        employee.employeeSummary(); // Print employee summary

        System.out.println();

        // Creating a Manager object and setting values
        Manager manager = new Manager();
        manager.setFirstName("Alice");
        manager.setLastName("Smith");
        manager.setEmployeeID(102);
        manager.setSalary(75000.0);
        manager.setDepartment("IT");
        manager.employeeSummary(); // Print manager summary
    }
}
