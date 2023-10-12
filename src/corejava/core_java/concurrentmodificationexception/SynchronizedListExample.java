package corejava.core_java.concurrentmodificationexception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Create a synchronized wrapper for the list
        List<Integer> synchronizedList = Collections.synchronizedList(numbers);

        for (int i = 1; i <= 5; i++) {
            synchronizedList.add(i);
        }

        Runnable task = () -> {
            // SynchronizedList ensures mutual exclusion
            synchronized (synchronizedList) {
                for (Integer number : synchronizedList) {
                    if (number % 2 == 0) {
                        synchronizedList.remove(number);
                    }
                }
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
