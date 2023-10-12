package multithreading.typestocreatethread;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Run Method of Runnable Interface");
        for (int i=0 ; i<5 ; i++){
            System.out.println("child thread "+ Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable= new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.setName("thread1");
        thread1.start();


        //by using lambda expression
        Thread thread2 = new Thread(() -> {
            for (int i=0 ; i<5 ; i++){
                System.out.println("child thread using lambda "+ Thread.currentThread().getName());
            }
        });

        thread2.setName("thread2");
        thread2.start();
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

