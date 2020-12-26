package core.java.exercisprograms;

public class SBIBank implements BankInterface, CustomerInterface {
    int cust_ID = 293;

    public void customerName(int custID) {
        if (custID == cust_ID) {
            System.out.println("HARIKRISHNA");
        }
    }

    public void customerAddress() {

        System.out.println("HYDERABAD");
    }

    public void customerHistory() {
        System.out.println("GOOD CUSTOMER");
    }

    public void rateOfInterest() {
        System.out.println("Bank -> SBI");
        System.out.println("ROI -> " + 9.0);
    }

    public void bankRating() {
        System.out.println("Rating -> GOOD");
    }

}
