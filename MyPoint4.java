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
