package multithreading.typestocreatethread;

public class MyThread  extends Thread{

    @Override  //Thread Class run method
     public void run(){
       // Thread.currentThread().start();  // if we try to start  already running thread then we will get IllegalThreadStateException
         for (int i=0; i<5; i++){
             System.out.println("child thread: "+ Thread.currentThread().getName());
         }
     }

    public static void main(String[] args) {
        MyThread myThread =new MyThread();
        myThread.start();//starting a thread , a new thread instance will be created with start method
        //and will  register a thread with thread  scheduler and it will call run method
        //myThread.run();  //will work as normal method call

     //   myThread.start();  // if we try to start  already running thread then we will get IllegalThreadStateException

        for (int i=0; i<5; i++){
            System.out.println("Parent thread: "+ Thread.currentThread().getName());
        }
    }
}

//        child thread: Thread-0
//        Parent thread: main
//        child thread: Thread-0
//        Parent thread: main
//        child thread: Thread-0
//        Parent thread: main
//        child thread: Thread-0
//        Parent thread: main
//        child thread: Thread-0
//        Parent thread: main


