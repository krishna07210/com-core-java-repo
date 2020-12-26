package core.java.demoprograms.set2;

import java.util.List;
import java.util.Map;

public class MainClassFile {
	public static void main(String[] args) {

//		BaseClass or = new OverrideExample();
//		or.display();

		/** Interface Example */
//		BankInterface axisbank = new AxisBank();
//		BankInterface icicibank = new ICICIBank();
//
//		int customer_ID = 1234;
//
//		String axis_address = axisbank.getCustomerAddress(customer_ID);
//		String icici_address = icicibank.getCustomerAddress(customer_ID);
//		System.out.println(axis_address);
//		System.out.println(icici_address);

		JDBCConvertRowsToMapObject obj =new JDBCConvertRowsToMapObject();
		
		List<Map<String,Object>> listMap = obj.bindProfileInfo();
		
		obj.displayProfileInfo(listMap);
		
	}
}
