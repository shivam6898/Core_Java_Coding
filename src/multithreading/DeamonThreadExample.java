package multithreading;


//Daemon thread is low priority thread main thread does not wait to complete execution for daemon thread
public class DeamonThreadExample {

    public static void main(String[] args) {
        Thread t1  = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("child thread execution... "+ i + " " + Thread.currentThread().getName() );
            }
        });
        t1.setName("t1");
        t1.setDaemon(true);
        t1.start();
       // t1.setDaemon(true);  //once we start a thread and try to make a daemon thread IllegalThreadStateException is thrown

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread execution... " + Thread.currentThread().getName());
        }

        System.out.println("main thread execution completed....");
    }
}
