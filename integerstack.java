import java.util.Scanner;

public class integerstack {
    private int[] stackarray;
    private int top;
    private int maxsize;

    public integerstack(int size) {
        maxsize = size;
        stackarray = new int[maxsize];
        top = -1;
    }

    public boolean isempty() {
        return top == -1;
    }

    public boolean isfull() {
        return top == maxsize - 1;
    }

    public void push(int value) {
        if (!isfull()) {
            stackarray[++top] = value;
            System.out.println("pushed" + value + "on to stack");
        } else {
            System.out.println("stack is full cannot push the value" + value);
        }
    }

    public int pop() {
        if (!isempty()) {
            int poppedvalue = stackarray[top--];
            System.out.println("popped element" + poppedvalue + "from the stack");
            return poppedvalue;
        } else {
            System.out.println("stack is empty so,we cannot pop the element");
            return -1;
        }
    }

    public int peek() {
        if (!isempty()) {
            return stackarray[top];
        } else {
            System.out.println("stack is empty cannot peek");
            return -1;
        }
    }

    public void display() {
        if (!isempty()) {
            System.out.println("stack content");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackarray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("stack is empty");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int size = scanner.nextInt();
        integerstack stack = new integerstack(size);
        System.out.println("enter the element to push into the stack.enter -1 to stop");
        int value;
        while (true) {
            System.out.println("enter the value");
            value = scanner.nextInt();
            if (value == -1) {
                break;
            }
            stack.push(value);
        }
        stack.display();
        stack.pop();
        stack.display();
        System.out.println("top element=" + stack.peek());
        scanner.close();
    }
}