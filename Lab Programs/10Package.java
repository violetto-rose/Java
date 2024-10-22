/*10. Develop a JAVA program to create a package named mypack and import & implement it in a suitable class.*/

import java.util.Scanner; // Import the Scanner class for user input

class MyPackage {
    public void display() {
        System.out.println("This is a method from the mypack package.");
    }
}

class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Package10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyPackage myPackage = new MyPackage();
        myPackage.display();
        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter the student's roll number: ");
        int studentRollNumber = scanner.nextInt();
        Student student = new Student(studentName, studentRollNumber);
        student.displayInfo();
        scanner.close(); // Close the scanner
    }
}