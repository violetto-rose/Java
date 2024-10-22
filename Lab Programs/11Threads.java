/*11. Write a program to illustrate creation of threads using runnable class. (start method start each of the newly created thread. Inside the run method there is sleep() for suspend the thread for 500 milliseconds).*/

import java.util.Scanner;

class thread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " is running.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class Threads11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of threads to create: ");
        int numThreads = scanner.nextInt();
        for (int i = 1; i <= numThreads; i++) {
            Thread thread = new Thread(new thread(), "Thread " + i);
            thread.start();
        }
        System.out.println("Main thread is running.");
        scanner.close();
    }
}