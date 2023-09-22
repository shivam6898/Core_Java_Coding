package multithreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Rather then creating individual threads and executing the job,
// create thread poll and these thread poll is ready to perform the jobs.
public class ExecutorExample {
    public static void main(String[] args) {

        PrintJob[] printJobs = {
                new PrintJob("shivam"),
                new PrintJob("prabal"),
                new PrintJob("task1"),
                new PrintJob("task2"),
                new PrintJob("task3"),
                new PrintJob("task4")
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (PrintJob printJob : printJobs) {
            executorService.submit(printJob);
            //If Runnable Interface is used to create task then use submit method or use execute method
        }
        executorService.shutdown();

    }
}

class PrintJob implements Runnable{
    public String name ;
    public PrintJob(String name) {
       this.name  = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started " + name );
        System.out.println(Thread.currentThread().getName() + " completed " + name );
    }
}
//here 2 threads will asynchronously work on 6 task , two threads will start and then 2 threads will complete the task
//pool-1-thread-1 started shivam
//pool-1-thread-2 started prabal
//pool-1-thread-2 completed prabal
//pool-1-thread-1 completed shivam
//pool-1-thread-2 started task1
//pool-1-thread-2 completed task1
//pool-1-thread-2 started task3
//pool-1-thread-2 completed task3
//pool-1-thread-2 started task4
//pool-1-thread-2 completed task4
//pool-1-thread-1 started task2
//pool-1-thread-1 completed task2
