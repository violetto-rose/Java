/*4. A class called MyPoint, which models a 2D point with x and y coordinates, is designed as follows:
● Two instance variables x (int) and y (int).
● A default (or "no-arg") constructor that construct a point at the default location of (0, 0).
● A overloaded constructor that constructs a point with the given x and y coordinates.
● A method setXY() to set both x and y.
● A method getXY() which returns the x and y in a 2-element int array.
● A toString() method that returns a string description of the instance in the format "(x, y)".
● A method called distance(int x, int y) that returns the distance from this point to another point at the given (x, y) coordinates
● An overloaded distance(MyPoint another) that returns the distance from this point to the given MyPoint instance (called another)
● Another overloaded distance() method that returns the distance from this point to the origin (0,0) Develop the code for the class MyPoint. Also develop a JAVA program (called TestMyPoint) to test all the methods defined in the class.*/

public class MyPoint4 {
    private int x;
    private int y;

    // Default constructor
    public MyPoint4() {
        this.x = 0;
        this.y = 0;
    }

    // Overloaded constructor
    public MyPoint4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to return x and y in a 2-element int array
    public int[] getXY() {
        int[] coordinates = { x, y };
        return coordinates;
    }

    // Method to return a string description of the instance in the format "(x, y)"
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Method to calculate the distance from this point to another point at (x, y)
    // coordinates
    public double distance(int x, int y) {
        int xDistance = this.x - x;
        int yDistance = this.y - y;
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }

    // Overloaded method to calculate the distance from this point to another
    // MyPoint instance
    public double distance(MyPoint4 another) {
        int xDistance = this.x - another.x;
        int yDistance = this.y - another.y;
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }

    // Overloaded method to calculate the distance from this point to the origin
    // (0,0)
    public double distance() {
        return distance(0, 0);
    }
}
