package multithreading;



//if we don't override run method then run method will not be called and we will not get any output
public class MyThreadWithoutRunMethod extends Thread{



    public static void main(String[] args) {
        MyThreadWithoutRunMethod myThreadWithoutRunMethod = new MyThreadWithoutRunMethod();
        myThreadWithoutRunMethod.start();
    }
}

//no output


