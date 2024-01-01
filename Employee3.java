import java.util.Scanner;

public class Employee3 {
    private int id;
    private String name;
    private double salary;

    public Employee3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            double raiseAmount = (percent / 100) * salary;
            salary += raiseAmount;
            System.out.println(name + "'s salary has been raised by " + percent + "%. New salary is: $" + salary);
        } else {
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee salary: $");
        double salary = scanner.nextDouble();
        Employee3 employee = new Employee3(id, name, salary);
        System.out.println("Initial details:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.print("Enter the percentage to raise the salary: ");
        double raisePercentage = scanner.nextDouble();
        employee.raiseSalary(raisePercentage);
        scanner.close();
    }
}