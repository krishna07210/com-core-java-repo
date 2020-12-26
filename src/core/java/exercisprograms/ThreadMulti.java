package core.java.exercisprograms;

public class ThreadMulti extends Thread {
    // Both run Methods are local
    public void run() {
        System.out.println("Thread is Running");
    }

    public void run(int a) {
        System.out.println("Thread is Running2");

    }

    public void testSleepMethod () {

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(5000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println(e);
            } 
        }
    }
}
