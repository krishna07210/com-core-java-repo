package core.java.exercisprograms;

public class ParameterizedConstructor {
    int a, b;

    public ParameterizedConstructor() {
        a = 10;
        b = 10;
        System.out.println("Default Constructor");
        System.out.println("A - " + a);
        System.out.println("B - " + b);
    }

    public ParameterizedConstructor(int a) {

        System.out.println("Single Parameter Constructor");
        System.out.println("A - " + a);

    }

    public ParameterizedConstructor(int a, int b) {

        System.out.println("Two Parameter Constructor");
        System.out.println("A - " + a);
        System.out.println("B - " + b);

    }

    public ParameterizedConstructor(ParameterizedConstructor T) {

        System.out.println("ParameterizedConstructor  Constructor");
        System.out.println("T.A - " + T.a);
        System.out.println("T.B - " + T.b);

    }
}
