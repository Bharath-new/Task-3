import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Employee information
        System.out.println("Enter Employee Information:");
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double empSalary = scanner.nextDouble();

        // Create Employee object and calculate income tax
        Employee employee = new Employee(empId, empName, empSalary);
        employee.displayEmployeeDetails();
        double incomeTax = employee.calcTax();
        System.out.println("Income Tax: " + incomeTax);

        // Product information
        System.out.println("\nEnter Product Information:");
        System.out.print("Enter Product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Enter Product Price: ");
        double productPrice = scanner.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int productQuantity = scanner.nextInt();

        // Create Product object and calculate sales tax
        Product product = new Product(productId, productPrice, productQuantity);
        product.displayProductDetails();
        double salesTax = product.calcTax();
        System.out.println("Sales Tax: " + salesTax);

        // Close the scanner
        scanner.close();
    }
}
