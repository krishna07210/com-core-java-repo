package core.java.exercisprograms;

public class ThreadMethods extends Thread {

    String Curr_Thread, Priority;

    public void run() {

        Curr_Thread = String.valueOf(Thread.currentThread());
        Priority = String.valueOf(Thread.currentThread().getPriority());

        System.out.println("Current Thread Name - " + Curr_Thread + " - Priority -" + Priority);
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Current Thread - " + Curr_Thread + " val- " + i);
            } catch (Exception e) {
                System.out.println(e);
            }
            ;
        }
    }

}
