public class Employee2 {
    String name;
    int id;
    double salary;
    int phno;

    // Constructor
    public Employee2(String name, int id, double salary,int phno) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.phno= phno;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("Employee phno: " + phno);
    }

    public static void main(String[] args) {
        // Creating an Employee object
        Employee2 e1 = new Employee2("elon musk", 200, 500000.0,321456987);

        // Displaying employee information
        e1.displayInfo();
    }
}
