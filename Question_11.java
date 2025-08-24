class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor (like emp_init)
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    // Setter for salary (like set_salary)
    public void setSalary(double salary) {
        if (salary > 0) {
            this.monthlySalary = salary;
        }
    }

    // Method to display employee details (like emp_display)
    public void displayEmployee() {
        System.out.println("Employee: " + firstName + " " + lastName);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Yearly Salary: " + getYearlySalary());
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to increase salary by percentage
    public void giveRaise(double percentage) {
        monthlySalary += monthlySalary * (percentage / 100);
    }
}

public class Question_11 {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("Aditya", "Shelke", 30000);
        Employee emp2 = new Employee("Ravi", "Kumar", 45000);

        // Display initial details
        System.out.println("Before Raise:");
        emp1.displayEmployee();
        System.out.println();
        emp2.displayEmployee();

        // Give 10% raise
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        // Display after raise
        System.out.println("\nAfter 10% Raise:");
        emp1.displayEmployee();
        System.out.println();
        emp2.displayEmployee();
    }
}
