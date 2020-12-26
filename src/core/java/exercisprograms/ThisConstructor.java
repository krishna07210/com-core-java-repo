package core.java.exercisprograms;

public class ThisConstructor {
    public ThisConstructor() {

        this(1000);
        System.out.println("---------- This No Parameters Start -------- ");
        //this(); Gives Error Call to this must be first Statement
        System.out.println("---------- This No Parameters End-------- ");
    }

    public ThisConstructor(int a) {

        System.out.println("---------- This Single Parameters Start -------- ");
        System.out.println("A - " + a);
        System.out.println("---------- This Sigle Parameters End-------- ");
    }

    public ThisConstructor(int a, int b) {

        this();
        System.out.println("---------- This Two Parameters Start -------- ");
        System.out.println(" A- " + a);
        System.out.println(" B- " + b);

        //this(); Gives Error Call to this must be first Statement
        System.out.println("---------- This Two Parameters End-------- ");
    }
}
