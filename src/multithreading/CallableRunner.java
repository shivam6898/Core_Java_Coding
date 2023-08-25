package multithreading;

import main.java.multithreading.CallableTask;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		Future<String> welcomeFuture = 
				executorService.submit(new CallableTask("shivam"));
		
		System.out.print("\n new CallableTask(\"in28Minutes\") executed\n");
		
		String welcomeMessage = welcomeFuture.get();
		
		System.out.println(welcomeMessage);
		
		System.out.print("\n Main completed");
		executorService.shutdown();

	}

}

// new CallableTask("in28Minutes") executed
//		 Hello shivam
//
//		 Main completed