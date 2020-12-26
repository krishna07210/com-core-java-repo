package core.java.exercisprograms;

public class ThreadMulti2 implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
    // This is Local run Method
    public void run(int a) {
        System.out.println("Thread is Running2");
    }
}
