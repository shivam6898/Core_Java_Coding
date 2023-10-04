package multithreading;

import java.util.ArrayList;
import java.util.List;



class TaskManager {
    private List<String> taskList = new ArrayList<>();

    public synchronized void addTask(String task) {
        taskList.add(task);
        System.out.println("Task added: " + task);
        // Notify all waiting threads that a new task is available.
        notifyAll();
    }

    public synchronized String getTask() throws InterruptedException {
        while (taskList.isEmpty()) {
            // If the task list is empty, wait for a task to be added.
            System.out.println("Waiting for a task to be added...");
            wait();
        }
        // Remove and return the first task from the list.
        return taskList.remove(0);
    }
}

class WorkerThread extends Thread {
    private TaskManager taskManager;

    public WorkerThread(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String task = taskManager.getTask();
                System.out.println("Task processed: " + task);
                // Simulate some work being done.
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class NotifyAllExample {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Create and start multiple worker threads.
        //3 worker threads are started to get the task
        for (int i = 0; i < 3; i++) {
            WorkerThread workerThread = new WorkerThread(taskManager);
            workerThread.start();
        }

        // Add tasks to the task manager.
        for (int i = 1; i <= 10; i++) {
            taskManager.addTask("Task " + i);
        }
    }
}

//Waiting for a task to be added...
//Waiting for a task to be added...
//Waiting for a task to be added...
//Task added: Task 1
//Task added: Task 2
//Task added: Task 3
//Task added: Task 4
//Task added: Task 5
//Task added: Task 6
//Task added: Task 7
//Task added: Task 8
//Task added: Task 9
//Task added: Task 10
//Task processed: Task 1
//Task processed: Task 3
//Task processed: Task 2
//Task processed: Task 4
//Task processed: Task 5
//Task processed: Task 6
//Task processed: Task 7
//Task processed: Task 9
//Task processed: Task 8
//Waiting for a task to be added...
//Task processed: Task 10
//Waiting for a task to be added...
//Waiting for a task to be added...
//
//Process finished with exit code -1

