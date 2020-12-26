package core.java.exercisprograms;

public class InherChild1 extends InherBaseClass {
    int a = 200;

    void show() {
        System.out.println("----- Child Class 1 ----------");
        display();
        System.out.println("Derived Child Class1 : Show");
        System.out.println("Base Class A : " + super.a);
        System.out.println("Derived Child 1 A : " + a);
        System.out.println("----- Child Class 1  End ----------");
    }

    void A1() {
        System.out.println("Child Class 1 A1 Method");
    }
}

