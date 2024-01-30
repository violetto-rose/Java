/*2. Develop a stack class to hold a maximum of 10 integers with suitable methods. Develop a JAVA main method to illustrate Stack operations.*/

import java.util.Scanner;

public class IntegerStack2 {
    private int[] StackArray;
    private int top;
    private int maxSize;

    public IntegerStack2(int Size) {
        maxSize = Size;
        StackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int value) {
        if (!isFull()) {
            StackArray[++top] = value;
            System.out.println("Pushed " + value + " on to stack");
        } else {
            System.out.println("Stack is full, cannot push " + value);
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int PoppedValue = StackArray[top--];
            System.out.println("Popped " + PoppedValue + " from stack");
            return PoppedValue;
        } else {
            System.out.println("Scanner is empty, cannot pop");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return StackArray[top];
        } else {
            System.out.println("Stack is empty, cannot peek");
            return -1;
        }
    }

    public void display() {
        if (!isEmpty()) {
            System.out.println("Stack contents:");
            for (int i = 0; i <= top; i++) {
                System.out.println(StackArray[i] + "");
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
        IntegerStack2 stack = new IntegerStack2(size);
        System.out.println("Enter the value to push onto the stack. Enter -1 to stop");
        int value;
        while (true) {
            System.out.println("Enter the value");
            value = scanner.nextInt();
            if (value == -1) {
                break;
            }
            stack.push(value);
        }
        stack.display();
        stack.pop();
        stack.display();
        System.out.println("Top element" + stack.peek());
        scanner.close();
    }
}