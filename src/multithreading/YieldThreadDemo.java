package multithreading;

public class YieldThreadDemo {
    public static void main(String[] args) {
        YieldThread yieldThread= new YieldThread();
        yieldThread.setName("yield-thread");
        yieldThread.start();
        for (int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + ":"+ Thread.currentThread().getPriority() );
        }
    }
}
