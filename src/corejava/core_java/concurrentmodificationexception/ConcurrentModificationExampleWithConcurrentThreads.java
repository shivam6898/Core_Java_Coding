package corejava.core_java.concurrentmodificationexception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExampleWithConcurrentThreads {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Add some elements to the list
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        // Create two threads that iterate over the list and try to modify it
//        Runnable task = () -> {
//            for (Integer number : numbers) {
//                if (number % 2 == 0) {
//                    // Attempt to remove even numbers
//                    numbers.remove(number);    // ConcurrentModificationException may occur here
//                }
//            }
//        };

        Runnable task = () -> {
            // Use an iterator for safe removal
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                Integer number = iterator.next();
                if (number % 2 == 0) {
                    iterator.remove();
                }
            }
        };     // by using iterator ConcurrentModificationException will not occur

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
