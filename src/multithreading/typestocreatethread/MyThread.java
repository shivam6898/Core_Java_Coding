package multithreading.typestocreatethread;

public class MyThread  extends Thread{

    @Override  //Thread Class run method
     public void run(){
         for (int i=0; i<5; i++){
             System.out.println("child thread: "+ Thread.currentThread().getName());
         }
     }

    public static void main(String[] args) {
        MyThread myThread =new MyThread();
        myThread.start();//starting a thread
        //myThread.run();  //will work as normal method call
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


