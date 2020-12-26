package core.java.demoprograms.set2;

public class ICICIBank implements BankInterface {

	private int customer_ID = 10293;

	public int getBalanceAmount(int customer_ID) {
		return 1000;
	}

	public String getCustomerName(int customer_ID) {
		return customer_ID + "- Harikrihna Thariboyina";
	}

	public String getCustomerAddress(int customer_ID) {
		return customer_ID + "-MUMBAI";
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
