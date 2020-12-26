package core.java.threads.main;

import java.util.ArrayList;
import java.util.List;

import core.java.threads.subclasses.MyRunnable;

public class ThreadMain {

	public static void main(String[] args) {

		// We will store the threads so that we can check if they are done

		List<Thread> threads = new ArrayList<Thread>();

		// We will create 500 threads

		for (int i = 0; i < 10; i++) {

			String threadName = "Thread -" + i;
			Runnable task = new MyRunnable(10000000L + i, threadName);
			Thread worker = new Thread(task);
			// We can set the name of the thread
//			 worker.setName(String.valueOf(i));
			worker.setName(threadName);
			// Start the thread, never call method run() direct
			worker.start();
			// Remember the thread for later usage
			threads.add(worker);
		}

		int running = 0;

		do {
			running = 0;
			for (Thread thread : threads) {
				if (thread.isAlive()) {
					running++;
					System.out.println(thread.getName() + "is Alive");
				}
			}
			System.out.println("We have " + running + " running threads. ");
		} while (running > 0);

	}
}
