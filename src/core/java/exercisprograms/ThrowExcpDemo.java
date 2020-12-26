package core.java.exercisprograms;

public class ThrowExcpDemo {
    static void validate(int a) {
        try{
        if (a > 90) {
            throw new ArithmeticException("Not a Valid Number");
        } else {
            System.out.println("Welcome to Throw Excpetion Demo");
        }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}

