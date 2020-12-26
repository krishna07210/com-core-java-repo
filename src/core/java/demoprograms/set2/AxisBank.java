package core.java.demoprograms.set2;

public class AxisBank implements BankInterface {

	private int customer_ID = 10293;

	public int getBalanceAmount(int customer_ID) {
		return 1000;
	}

	public String getCustomerName(int customer_ID) {
		return customer_ID + "- Harikrihna";
	}

	public String getCustomerAddress(int customer_ID) {
		return customer_ID + "-HYDERABAD";
	}

	public void getCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}

	public void setCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}

	@Override
	public String toString() {
		return "AxisBank [customer_ID=" + customer_ID + "]";
	}

}
