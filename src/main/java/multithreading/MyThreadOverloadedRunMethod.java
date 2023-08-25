package multithreading;

public class MyThreadOverloadedRunMethod extends Thread {


    public void run() {
        System.out.println("no-arg");
    }


    public void run(int i) {
        System.out.println("with-arg");

    }

    public static void main(String[] args) {
        MyThreadOverloadedRunMethod myThreadWithoutRunMethod = new MyThreadOverloadedRunMethod();
        myThreadWithoutRunMethod.start();
    }
}

//no-arg


