public class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    // Constructor to initialize Employee details
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Method to calculate income tax
    @Override
    public double calcTax() {
        return salary * INCOME_TAX; // Income tax = salary * 10.5%
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
