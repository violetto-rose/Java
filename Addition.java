
import java.util.Scanner;

class Addition {
    public static void main(String args[]) {
        int a, b, sum; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        sum = a + b;
        System.out.printf("The sum is %d\n", sum);
        sc.close();
    }
}
