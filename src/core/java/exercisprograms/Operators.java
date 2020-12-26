package core.java.exercisprograms;

public class Operators {

    int A = 30, B = 20;

    void arithmeticOperators() {

        System.out.println("**Arithmetic Operators**");
        System.out.println("A + B = " + (A + B));
        System.out.println("A - B = " + (A - B));
        System.out.println("A * B = " + (A * B));
        System.out.println("A / B = " + (A / B));
        System.out.println("A % B = " + (A % B));
        System.out.println("++A = " + (++A));
        System.out.println("--A = " + (--A));
    }

    void relationalOperators() {

        //If else
        if (A == B) {
            System.out.println("(A == B) is true");
        } else {
            System.out.println("(A == B) is not true");
        }
        //Nested If else
        if (A == B) {
            System.out.println("(A == B) is true");
        } else if (A != B) {
            System.out.println("(A == B) is not true");
        } else {
            System.out.println("Default Else");
        }
        // Switch

        switch (A) {
        case 10:
            System.out.println("A=10");
            break;
        case 20:
            System.out.println("A=20");
            break;
        case 30:
            System.out.println("A=30");
            break;
        default:
            System.out.println("A >30");
        }

        String s = "";
        for (int i = 1; i < 10; i++) {
            
            for (int j = 1; j <= i; j++) {
                s = s + '*' ;
            }
            s = s + "\n";
        }
        System.out.println(s);
        
        
    }

    void invokeOperators() {
        arithmeticOperators();
        relationalOperators();

    }
}
