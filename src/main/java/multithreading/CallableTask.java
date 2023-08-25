package main.java.multithreading;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    private String name;

    public CallableTask(String name) {
        this.name = name;
    }


    //here thread returns something after execution
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello " + name;
    }

}
