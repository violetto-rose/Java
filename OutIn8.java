/*8. Develop a JAVA program to create an outer class with a function display. Create another class inside the outer class named inner with a function called display and call the two functions in the main class.*/

import java.util.Scanner;

class Outer {
    // Function in the outer class
    public void display(String message) {
        System.out.println("Outer class: " + message);
    }

    // Inner class
    class Inner {
        // Function in the inner class
        public void display(String message) {
            System.out.println("Inner class: " + message);
        }
    }
}

public class OutIn8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an instance of the outer class
        Outer outer = new Outer();
        // Prompt the user to enter a message for the outer class
        System.out.print("Enter a message for the outer class: ");
        String outerMessage = scanner.nextLine();
        // Call the display function of the outer class with user input
        outer.display(outerMessage);
        // Create an instance of the inner class within the outer class
        Outer.Inner inner = outer.new Inner();
        // Prompt the user to enter a message for the inner class
        System.out.print("Enter a message for the inner class: ");
        String innerMessage = scanner.nextLine();
        // Call the display function of the inner class with user input
        inner.display(innerMessage);
        scanner.close();
    }
}