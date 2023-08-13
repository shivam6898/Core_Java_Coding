package multithreading;

public class MyThreadWithoutRunMethod extends Thread{



    public static void main(String[] args) {
        MyThreadWithoutRunMethod myThreadWithoutRunMethod = new MyThreadWithoutRunMethod();
        myThreadWithoutRunMethod.start();
    }
}

//no output


