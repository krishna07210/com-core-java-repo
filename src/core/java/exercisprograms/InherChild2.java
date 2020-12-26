package core.java.exercisprograms;

public class InherChild2 extends InherChild1 {

    int a = 300;

    void show() {

        System.out.println("----- Child Class 2 ----------");
        /*
        super.show();
        System.out.println("Derived Child Class2 -Show");
        System.out.println("Base Class A : " + super.a);
        System.out.println("Derived Child1 A : " + a);
        System.out.println("----- Child Class 2 End ----------");
        */

        A1();
        super.A1();

    }


}
