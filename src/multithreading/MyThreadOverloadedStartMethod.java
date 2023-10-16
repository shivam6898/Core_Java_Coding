package multithreading;

public class MyThreadOverloadedStartMethod extends Thread{

    public void run() {
        System.out.println("run method");
    }


    //if we override start method then new thread will not create and run method will not be called
    public void start() {
        System.out.println("start methd");

    }

    public static void main(String[] args) {
        MyThreadOverloadedStartMethod myThreadWithoutRunMethod = new MyThreadOverloadedStartMethod();
        myThreadWithoutRunMethod.start();
        //myThreadWithoutRunMethod.start();   // IllegalThreadStateException
    }
}

//start method - as normal method call


