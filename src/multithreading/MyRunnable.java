package multithreading;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Run Method of Runnable Interface");
        for (int i=0 ; i<5 ; i++){
            System.out.println("child thread"+ Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable= new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("main-thread-"+ Thread.currentThread().getName());
    }
}


//        Run Method of Runnable Interface
//        child threadThread-0
//        main-thread-main
//        child threadThread-0
//        child threadThread-0
//        child threadThread-0
//        child threadThread-0

