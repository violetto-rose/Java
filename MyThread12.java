/*12. Develop a program to create a class MyThread in this class a constructor, call the base class constructor, using super and start the thread. The run method of the class starts after this. It can be observed that both main thread and created child thread are executed concurrently.*/

import java.util.Scanner;

class myThread extends Thread {
    public myThread() {
        super(); // Call the base class (Thread) constructor
        start(); // Start the thread
    }

    @Override
    public void run() {
        System.out.println("Child thread is running.");
    }
}

public class MyThread12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of child threads to create: ");
        int numThreads = scanner.nextInt();
        for (int i = 0; i < numThreads; i++) {
            myThread childThread = new myThread();
        }
        System.out.println("Main thread is running.");
        scanner.close();
    }
}