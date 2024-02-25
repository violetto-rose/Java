/*7. Develop a JAVA program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.*/

import java.util.Scanner;

// Define the Resizable interface
interface Resizable {
    void resizeWidth(int width);

    void resizeHeight(int height);
}

// Implement the Resizable interface in the Rectangle class
class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void displayDimensions() {
        System.out.println("Width : " + getWidth());
        System.out.println("Height : " + getHeight());
    }
}

public class Resize7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial width of the rectangle");
        int initialWidth = sc.nextInt();
        System.out.println("Enter the initial height of the rectangle");
        int initialHeight = sc.nextInt();

        // Create a Rectangle object with user-defined dimensions
        Rectangle rectangle = new Rectangle(initialWidth, initialHeight);

        // Display the initial dimensions
        System.out.println("Initial Dimensions : ");
        rectangle.displayDimensions();

        // Prompt the user to resize the rectangle
        System.out.println("Enter the new width to resize the rectangle : ");
        int newWidth = sc.nextInt();
        rectangle.resizeWidth(newWidth);
        System.out.println("Enter the new height to resize the rectangle : ");
        int newHeight = sc.nextInt();
        rectangle.resizeHeight(newHeight);

        // Display the updated dimensions
        System.out.println("\nUpdated Dimensions : ");
        rectangle.displayDimensions();
        sc.close();
    }
}