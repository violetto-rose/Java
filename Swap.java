public class Swap {
    public static void main(String args[]) {
        int a = 10, b = 5, temp;
        System.out.printf("Value of a and b before swapping is a & b is %d and %d\n", a, b);
        temp = a;
        a = b;
        b = temp;
        System.out.printf("Value of a and b after swapping is a & b is %d and %d", a, b);
    }
}