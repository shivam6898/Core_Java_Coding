package multithreading;

public class JoinMethodExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        // Join thread1 and thread2 to wait for their completion
        thread1.join(); // thread 1 waits completion for thread2
        thread2.join();  // thread 2 waits completion for thread1

        System.out.println("Both threads have completed.");
    }
}

// the main thread waits for both thread1 and thread2 to finish using the join() method
// before printing the final message.
// This is useful when you need to ensure that specific threads complete their execution
// before the main thread proceeds with its tasks.

//op
//        Thread 2: 1
//        Thread 1: 1
//        Thread 2: 2
//        Thread 1: 2
//        Thread 2: 3
//        Thread 1: 3
//        Thread 2: 4
//        Thread 1: 4
//        Thread 2: 5
//        Thread 1: 5
//        Both threads have completed.
