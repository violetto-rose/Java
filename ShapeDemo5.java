/*5. Develop a JAVA program to create a class named shape. Create three sub classes namely: circle, triangle and square, each class has two member functions named draw () and erase (). Demonstrate polymorphism concepts by developing suitable methods, defining member data and main program.*/

class MyShape {
    // Member function to draw a shape
    public void draw() {
        System.out.println("Drawing a generic shape");
    }

    // Member function to erase a shape
    public void erase() {
        System.out.println("Erasing a generic shape");
    }
}

class MyCircle extends MyShape {
    // Member function to draw a circle
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Member function to erase a circle
    @Override
    public void erase() {
        System.out.println("Erasing a circle");
    }
}

class MyTriangle extends MyShape {
    // Member function to draw a triangle
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    // Member function to erase a triangle
    @Override
    public void erase() {
        System.out.println("Erasing a triangle");
    }
}

class MySquare extends MyShape {
    // Member function to draw a square
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    // Member function to erase a square
    @Override
    public void erase() {
        System.out.println("Erasing a square");
    }
}

public class ShapeDemo5 {
    public static void main(String[] args) {
        MyShape[] shapes = new MyShape[3];
        shapes[0] = new MyCircle();
        shapes[1] = new MyTriangle();
        shapes[2] = new MySquare();

        // Demonstrate polymorphism by calling draw() and erase() on each shape
        for (MyShape shape : shapes) {
            shape.draw();
            shape.erase();
            System.out.println(); // Separate each shape's actions
        }
    }
}
