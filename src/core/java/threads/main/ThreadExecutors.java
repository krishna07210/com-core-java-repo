
package core.java.threads.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import core.java.threads.subclasses.MyRunnable;

public class ThreadExecutors {

	private static final int NTHREDS = 10;

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		TimeUnit tu=TimeUnit.DAYS;

		for (int i = 0; i < 500; i++) {
			String threadName = "Thread -" + i;
			Runnable worker = new MyRunnable(10000000L + i, threadName);
			executor.execute(worker);
		}

		// This will make the executor accept no new threads
		// and finish all existing threads in the queue
		executor.shutdown();
		// Wait until all threads are finish
		executor.awaitTermination(1000L,tu);
		System.out.println("Finished all threads");

	}
}
