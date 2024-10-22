import java.util.Scanner;

public class TestMyPoint4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a MyPoint object using the default constructor
        MyPoint4 point1 = new MyPoint4();
        System.out.println("Default Point1: " + point1);
        // Create a MyPoint object using the overloaded constructor with user input
        System.out.print("Enter x coordinate for Point2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y coordinate for Point2: ");
        int y2 = scanner.nextInt();
        MyPoint4 point2 = new MyPoint4(x2, y2);
        System.out.println("Point2: " + point2);
        // Use the setXY method to change the coordinates of point1
        System.out.print("Enter new x coordinate for Point1: ");
        int newX1 = scanner.nextInt();
        System.out.print("Enter new y coordinate for Point1: ");
        int newY1 = scanner.nextInt();
        point1.setXY(newX1, newY1);
        System.out.println("Updated Point1: " + point1);
        // Calculate and print the distance between points
        double distance1 = point1.distance(x2, y2);
        double distance2 = point1.distance(point2);
        double distance3 = point2.distance(); // Distance to the origin (0,0)
        System.out.println("Distance from Point1 to Point2: " + distance1);
        System.out.println("Distance from Point1 to Point2: " + distance2);
        System.out.println("Distance from Point2 to the origin: " + distance3);
        scanner.close();
    }
}