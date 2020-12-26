package core.java.threads.subclasses;

public class MyRunnable implements Runnable {

	private final long countUntil;
	private final String threadName;

	public MyRunnable(long countUntil, String threadName) {
		this.countUntil = countUntil;
		this.threadName = threadName;
	}

	@Override
	public void run() {
		long sum = 0;

		for (long i = 1; i < countUntil; i++) {
			sum += i;
		}
		System.out.println("Thread - > "+threadName + " ; Sum -> " + sum );
	}

}
