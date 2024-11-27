class Calculator {
    public static int calculate(int a, int b, String op) {
        int result = 0;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        int a = Integer.parseInt(args[0]);
        System.out.println("Enter the second number: ");
        int b = Integer.parseInt(args[1]);
        System.out.println("Enter the operator: ");
        String op = args[2];
        int result = calculate(a, b, op);
        System.out.println("Result: " + result);
    }
}