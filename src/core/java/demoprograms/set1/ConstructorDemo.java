package core.java.demoprograms.set1;

public class ConstructorDemo {
    void testMethod() {
        System.out.println("testMethod Code");
    }

    public static void main(String[] args) {
        ConstructorDemo constDemo = new ConstructorDemo();
        EmployeeInfo empInfo = new EmployeeInfo();
        EmployeeInfo empInfo1 = new EmployeeInfo(293);
        constDemo.testMethod();
        //        empInfo.employeeKYC();
        //        SumDemo sum = new SumDemo();
        //        sum.addValues();
    }
}
