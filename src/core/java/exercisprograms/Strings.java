package core.java.exercisprograms;

public class Strings {
    String s1 = "HARI";
    String s2 = "HARI";
    String s3 = "KRISHNA";

    void stringOperations() {

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); //1(because s1>s3)
        System.out.println(s3.compareTo(s2)); //1(because s1>s3)
        
        System.out.println(s2.concat(" ").concat(s3));
        
        System.out.println("Sub String :" + s3.substring(0,4));
        System.out.println(s3.substring(6)); 
        System.out.println(s3.toUpperCase()); 
        System.out.println(s3.toLowerCase());

    }
}
