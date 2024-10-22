/*9. Develop a JAVA program to raise a custom exception (user defined exception) for DivisionByZero using try, catch, throw and finally.*/

import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Exception9 {
    public static double divide(int numerator, int denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.");
        }
        return (double)numerator/denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();
        System.out.print("Enter a custom name for the exception: ");
        String customExceptionName = scanner.next();
        try {
            double result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            System.err.println("Error (" + customExceptionName + "): " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        scanner.close();
    }
}