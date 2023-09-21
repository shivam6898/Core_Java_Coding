package multithreading;

public class ThreadLocalExample {
    private static ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable task = () -> {
            int value = threadLocalValue.get();
            System.out.println(Thread.currentThread().getName() + ": ThreadLocal value = " + value);
            threadLocalValue.set(value + 1);
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//Thread-0: ThreadLocal value = 0
//Thread-1: ThreadLocal value = 0