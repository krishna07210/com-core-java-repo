package core.java.exercisprograms;

public class ArrayClass {
    int A1[] = new int[5];
    String family[] = { "HARI", "KRISHNA", "LIKITH", "VAMSHI", "JESWITHA" };

    public void initialization() {
        A1[0] = 1;
        A1[1] = 2;
        A1[2] = 3;
        A1[3] = 4;
        A1[4] = 5;
    }

    public void displayArray(int size) {

        System.out.println("A1 Array Length -" + A1.length);
        for (int i = 0; i <= A1.length - 1; i++) {
            try {

                System.out.println(A1[i]);
            } catch (Exception e) { //java.lang.ArrayIndexOutOfBoundsException
                //return;
                continue;
            }
        }
        System.out.println("Family Array Length -> " + family.length);
        for (int i = 0; i <= family.length - 1; i++) {

            System.out.println(family[i]);
        }
    }
    //Passing Array to method in java
    //get minimum number of an array using method.
    public void getminElement(int array[]) {
        int min_val;
        min_val = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min_val > array[i]) {
                min_val = array[i];
            }
        }
        System.out.println("The Minimum Element -> " + min_val);
    }

    public void twoDimentionalArrya(int A1[][], int A2[][]) {

        int C1[][] = new int[2][2];

        System.out.println("A1 Matrix :");
        for (int i = 0; i < A1.length; i++) {
            for (int j = 0; j < A2.length; j++) {
                System.out.print(A1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("A2 Matrix :");
        for (int i = 0; i < A2.length; i++) {
            for (int j = 0; j < A2.length; j++) {
                System.out.print(A2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("C1 Matrix :");
        for (int i = 0; i < A1.length; i++) {
            for (int j = 0; j < A2.length; j++) {

                C1[i][j] = A1[i][j] * A2[j][i];
                System.out.print(C1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
