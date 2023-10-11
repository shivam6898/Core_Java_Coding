package multithreading;

class Counter {
    private int count = 0;

    public synchronized  void increment() {
        System.out.println(Thread.currentThread().getName() + " started");
        count++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " completed");
    }

    public synchronized int getCount() {
        return count;
    }
}

public class SynchronizedMethodExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Final Count: " + counter.getCount());
    }
}
//if not synchronized
//        Thread-0 started
//        Thread-1 started
//        Thread-1 completed
//        Thread-0 completed
//        Thread-0 started
//        Thread-1 started
//        Thread-0 completed
//        Thread-0 started
//        Thread-1 completed
//        Thread-1 started
//        Thread-0 completed
//        Thread-1 completed
//        Thread-1 started
//        Thread-0 started
//        Thread-0 completed
//        Thread-0 started
//        Thread-1 completed
//        Thread-1 started
//        Thread-0 completed
//        Thread-1 completed
//        Final Count: 10

//if  synchronized
//        Thread-0 started
//        Thread-0 completed
//        Thread-1 started
//        Thread-1 completed
//        Thread-1 started
//        Thread-1 completed
//        Thread-1 started
//        Thread-1 completed
//        Thread-0 started
//        Thread-0 completed
//        Thread-0 started
//        Thread-0 completed
//        Thread-0 started
//        Thread-0 completed
//        Thread-0 started
//        Thread-0 completed
//        Thread-1 started
//        Thread-1 completed
//        Thread-1 started
//        Thread-1 completed
//        Final Count: 10
