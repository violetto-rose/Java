import java.util.Scanner;

class AOT {
    public static void main(String args[]) {
        double height, base, area; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of height");
        height = sc.nextDouble();
        System.out.println("Enter the value of base");
        base = sc.nextDouble();
        area=0.5*height*base;
        System.out.println("The area is"+area);
        sc.close();
    }
}
