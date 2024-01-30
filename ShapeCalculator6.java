import java.util.Scanner;

abstract class MyCustomShape {
    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

class MyCustomCircle extends MyCustomShape {
    private double radius;

    public MyCustomCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class MyCustomTriangle extends MyCustomShape {
    private double sideA;
    private double sideB;
    private double sideC;

    public MyCustomTriangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

public class ShapeCalculator6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        System.out.print("Enter the length of side A of the triangle: ");
        double sideA = scanner.nextDouble();
        System.out.print("Enter the length of side B of the triangle: ");
        double sideB = scanner.nextDouble();
        System.out.print("Enter the length of side C of the triangle: ");
        double sideC = scanner.nextDouble();
        MyCustomCircle circle = new MyCustomCircle(circleRadius);
        MyCustomTriangle triangle = new MyCustomTriangle(sideA, sideB, sideC);
        scanner.close();
        System.out.println("Circle - Radius: " + circleRadius);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Triangle - Sides: A=" + sideA + ", B=" + sideB + ", C=" + sideC);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}