public class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Creating an Employee object
        Employee e1 = new Employee("elon musk", 200, 500000.0);

        // Displaying employee information
        e1.displayInfo();
    }
}
