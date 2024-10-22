import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        int a, b, product;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for a: ");
        a = sc.nextInt();
        System.out.print("Enter the value for b: ");
        b = sc.nextInt();
        product = a * b;
        System.out.println("Product: " + product);
        sc.close();
    }
}
