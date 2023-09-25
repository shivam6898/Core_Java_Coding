package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableTwoThreadsExample {
    public static void main(String[] args) {
        AtomicInteger sharedCounter = new AtomicInteger(0);

        Runnable incrementTask = () -> {
            for (int i = 0; i < 5; i++) {
                int newValue = sharedCounter.incrementAndGet();
                System.out.println(Thread.currentThread().getName() + ": Incremented to " + newValue);
            }
        };

        Thread thread1 = new Thread(incrementTask, "Thread 1");
        Thread thread2 = new Thread(incrementTask, "Thread 2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Value: " + sharedCounter.get());
    }
}
