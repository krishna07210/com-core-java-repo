package core.java.exercisprograms;

public class SampleThis {
    int a, b;

    public SampleThis(int a, int b) {


        System.out.println("Loca A - " + this.a);
        System.out.println("Loca B - " + this.b);

        this.a = a;
        this.b = b;

        System.out.println("Loca A - " + this.a);
        System.out.println("Loca B - " + this.b);
        a = a + 10;
        b = b + 10;

        this.a = this.b + 10;
        this.a = this.b + 10;


        System.out.println("Loca A - " + this.a);
        System.out.println("Loca B - " + this.b);
    }
}
