package multithreading;

public class MyThreadOverloadedStartMethod extends Thread{


    public void run() {
        System.out.println("run method");
    }


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


