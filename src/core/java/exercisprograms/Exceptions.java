package core.java.exercisprograms;

public class Exceptions {
    int a, b;

    void addNumbers() {


        try {
            b = a / 0;

        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }


    }
}
