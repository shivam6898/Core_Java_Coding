package multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


 class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		List<CallableTask> tasks = List.of(
				new CallableTask("shivam"),
				new CallableTask("prabal"),
				new CallableTask("vibhansu"));

		//invokeAny Method gets the first completed task as a result
		String result = executorService.invokeAny(tasks);
		
		System.out.println(result);

		executorService.shutdown();
	}

}

//it will give any one result at a time