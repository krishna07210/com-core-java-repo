package core.java.exercisprograms;
//package DemoPrograms;

import java.util.ArrayList;
import java.sql.*;
import java.util.Iterator;
import java.util.AbstractMap;
import java.util.Map;

//https://www.javatpoint.com/java-string-isempty

public class MainClass {
	public static void main(String[] args) {

		// MainClass mainClass = new MainClass();

		/* ~~~~~~~~~~~~~ Illustrate "this" Demo SampleThis ~~~~~~~~~~~~~ */

		// SampleThis s1 = new SampleThis(10, 20);

		/* ~~~~~~~~~~~~~ Illustrate Constructor as Parameterized ~~~~~~~~~~~~~ */
		// ParameterizedConstructor p1 = new ParameterizedConstructor();
		// ParameterizedConstructor p2 = new ParameterizedConstructor(90);
		// ParameterizedConstructor p3 = new ParameterizedConstructor(100, 200);
		// ParameterizedConstructor p4 = new ParameterizedConstructor(p1);
		// ParameterizedConstructor p5 = new ParameterizedConstructor(p3); // Have Doubt
		// why the values not Displaying

		/* ~~~~~~~~~~~~~ Illustrate this(), this(..) ~~~~~~~~~~~~~ */
		// ThisConstructor T1 = new ThisConstructor(60, 70);

		/* ~~~~~~~~~~~~~ Illustrate Inheritance ~~~~~~~~~~~~~ */
		/* ~~~~~~~~~~~~~ Single Inheritance ~~~~~~~~~~~~~ */
		// InherChild1 c1 = new InherChild1();
		// c1.show();

		/* ~~~~~~~~~~~~~ Multi Inheritance ~~~~~~~~~~~~~ */
		// InherChild2 c2 = new InherChild2();
		// c2.show(); // Super(..)

		// InherChild4 c4 = new InherChild4();

		/* ~~~~~~~~~~~~~ Operators ~~~~~~~~~~~~~ */

		// Operators op = new Operators();
		// op.invokeOperators();

		/* ~~~~~~~~~~~~~ Strings ~~~~~~~~~~~~~ */
		// Strings s = new Strings();
		// s.stringOperations();

		/* ~~~~~~~~~~~~~ Exception ~~~~~~~~~~~~~ */
		// Exceptions e = new Exceptions();
		// e.addNumbers();

		/* ~~~~~~~~~~~~~ Thread ~~~~~~~~~~~~~ */

		// ThreadMulti t1 = new ThreadMulti();
		// t1.run();
		// t1.testSleepMethod();

		// Thread t3 = new Thread(t2);
		// t3.start();

		// ThreadMulti t1 = new ThreadMulti();
		// t1.testSleepMethod();

		/* ~~~~~ Can we start a thread twice; Excepected Error */
		/* ~~~~~ -java.lang.IllegalThreadStateException ~~~~~~~~~~~~~ */

		// ThreadMulti2 t2 = new ThreadMulti2();
		//
		// Thread t3 = new Thread(t2);
		// t3.start();
		// t3.start();

		// ThreadMethods tm1 = new ThreadMethods();
		// ThreadMethods tm2 = new ThreadMethods();
		// tm1.start();
		// tm1.setName("Test Thread- 1");
		// tm2.setName("Test Thread- 2");
		// try {
		// tm1.sleep(20000);
		// } catch (Exception g) {
		// System.out.println(g);
		// }
		// System.out.println(" Main Clause Thread Name - " + tm1.getName());
		// System.out.println(" Main Clause Thread ID " + tm1.getId());
		// try {
		// tm1.sleep(20000);
		// } catch (Exception e1) {
		// System.out.println(e1);
		// }
		// tm2.start();
		// tm1.setPriority(Thread.MIN_PRIORITY);
		// tm2.setPriority(Thread.MAX_PRIORITY);
		//
		// tm1.start();
		// tm2.start();

		/* ~~~~~~~~~~~~~ Abstract Class Test ~~~~~~~~~~~~~ */
		// BankAbsClass b;
		// b = new SBIAbsClass();
		// System.out.println("SBI Bank Rate of Interest" + b.getRateOfInterest());
		// b = new ICICIAbsClass();
		// System.out.println("ICICI Bank Rate of Interest" + b.getRateOfInterest());

		/* ~~~~~~~~~~~~~ Interface Test ~~~~~~~~~~~~~ */
		// TestInterfaceClass i = new TestInterfaceClass();
		// i.print();
		// i.show();
		// System.out.println("*** Bank Info***");
		// BankInterface b1 = new SBIBank();
		// b1.rateOfInterest();
		// b1.bankRating();
		// System.out.println("***Customer Info***");
		// CustomerInterface c1 = new SBIBank();
		// c1.customerName(293);
		// c1.customerAddress();
		// c1.customerHistory();
		//
		// BankInterface b2 = new PNBBank();
		// b2.rateOfInterest();
		// b2.bankRating();
		// System.out.println("***Customer Info***");
		// CustomerInterface c2 = new SBIBank();
		// c2.customerName(569);
		// c2.customerAddress();
		// c2.customerHistory();

		/* ~~~~~~~~ Import Class from another package -> DemoPrograms ~~~~~~~~ */
		// ImportClassDemo e = new ImportClassDemo();
		// DemoPrograms.ImportClassDemo e = new DemoPrograms.ImportClassDemo();
		// DemoPackageImport e1 = new DemoPackageImport();
		// DemoPrograms.examples.DemoPackageImport e1 = new
		// DemoPrograms.examples.DemoPackageImport();
		// e.importDisplay();
		// e1.importDisplay();

		/* ~~~~~~~~ Object cloning ~~~~~~~~~~~~ */
		// DemoPrograms.examples.DemoPackageImport e1 = new
		// DemoPrograms.examples.DemoPackageImport();
		// e1.importDisplay();
		// DemoPrograms.examples.DemoPackageImport e2 =
		// (DemoPrograms.examples.DemoPackageImport) e1.clone();

		/* ~~~~~~~~~~ Arrays ~~~~~~~~~~~~~~ */

		// ArrayClass ar1 = new ArrayClass();
		// ar1.initialization();
		// ar1.displayArray(5);

		/* ~~~~~~Array as Method input ~~~~~~~~~ */

		// int B1[] = { 99, 43, 34, 56, 23, 54, 122, 675, 345, 33 };
		// ar1.getminElement(B1);
		//
		// ArrayClass ar2 = new ArrayClass();
		// int X1[][] = { { 1, 2 }, { 3, 4 } };
		// int X2[][] = { { 2, 0 }, { 1, 2 } };
		// ar2.twoDimentionalArrya(X1, X2);

		/* ~~~~~~~~~~~~ Exceptions ~~~~~~~~~~~~ */

		/* --> Throw -> used to explicitly throw an exception. */
		// ThrowExcpDemo e2 = new ThrowExcpDemo();
		// e2.validate(91);
		//
		/* --> Throws -> */
		// try {
		// ThrowsExcpDemo e3 = new ThrowsExcpDemo();
		// e3.method();
		// } catch (Exception e3) {
		// System.out.println("Exception Handled Here");
		// }
		// System.out.println("Normal Flow");

		/* *************** Collections **********************/

		/*----> ArrayList :   */
		/*--> ArrayList class uses a dynamic array for storing the elements.*/

		// ArrayList<String> list = new ArrayList<String>();

		/*--->  Creating arraylist ~~~~~~~~~~*/

		// list.add("Hari");

		/* ---> Adding object in arraylist */

		// list.add("Krishna");
		// list.add("Vamshi");
		// list.add("Likith");

		/*---->  Traversing list through Iterator */
		// Iterator itr = list.iterator();
		// while (itr.hasNext()) {
		// System.out.println(itr.next());
		// }

		/*---->  Collection through for-each loop */

		// for (String obj : list) {
		// System.out.println(obj);
		// }

		/*----> Creating user-defined class objects  */

		// ArrayListDemo A1 = new ArrayListDemo(1111, "Harikrishna", 32);
		// ArrayListDemo A2 = new ArrayListDemo(2222, "Likithkrishna", 28);
		// ArrayListDemo A3 = new ArrayListDemo(3333, "Vamshikrishna", 20); // Create
		// ArrayList

		// ArrayList<ArrayListDemo> al1 = new ArrayList<ArrayListDemo>();
		// al1.add(A1);
		// al1.add(A2);
		// al1.add(A3);
		// for (ArrayListDemo obj : al1) {
		// System.out.println(obj.rollno + "-" + obj.name + "-" + obj.age);
		// }

		// ArrayListDemo B1 = new ArrayListDemo(4444, "Jeswitha", 12);
		// ArrayListDemo B2 = new ArrayListDemo(5555, "Mounika", 20);
		// ArrayListDemo B3 = new ArrayListDemo(6666, "Abinav", 23);

		// ArrayList<ArrayListDemo> al2 = new ArrayList<ArrayListDemo>();
		// al2.add(B1);
		// al2.add(B2);
		// al2.add(B3);

		// Iterator itr1 = al2.iterator();

		// while (itr1.hasNext()) {
		// ArrayListDemo A = (ArrayListDemo) itr1.next();
		// System.out.println(A.rollno + "/" + A.name + "/" + A.age);
		// }

		// al1.addAll(al2);

		/*----> adding second list in first list */
		// for (ArrayListDemo obj : al1) {
		// System.out.println(obj.rollno + "**" + obj.name + "**" + obj.age);
		// }

		// al1.removeAll(al2);
		// System.out.println("iterating the elements after removing the elements of
		// al2...");

		// for (ArrayListDemo obj : al1) {
		// System.out.println(obj.rollno + "--" + obj.name + "--" + obj.age);
		// }
		// al1.retainAll(al2);

		// for (ArrayListDemo obj : al2) {
		// System.out.println(obj.rollno + "##" + obj.name + "##" + obj.age);
		// }

		/* ~~~~~~~~~ JDBC Programs ~~~~~~~~~~~~~~~ */
		/* ---> Example 1 */
		// OracleJDBCConn jdbcObj = new OracleJDBCConn();
		// jdbcObj.displayProfileInfo();

		/* ---> Example 2 :PreparedStatement */

		JdbcExample jdbcObj = new JdbcExample();

		int profile_id = 42181;
		// jdbcObj.displayProfileInfo();
		// jdbcObj.displayProfileInfoInput(profile_id);
		// jdbcObj.getProfileMetaData();
		// jdbcObj.getDatabaseMetaData();
		// String agmt_name = "Cisco Systems Inc.";
		// jdbcObj.getCallableStatementProc(profile_id, agmt_name);

		// String profileStatus = null;
		// profileStatus = jdbcObj.getCallableStmtgetProfileStatusFunc(profile_id);
		// System.out.println("Profile Status -> " + profileStatus);

		String instance_name = "DV1RAO";
		/*-->  Retrun as Map */
		// Map<String, String> mapColl = jdbcObj.getCallableStmtProcOut(instance_name);
		//
		// for (String key : mapColl.keySet()) {
		// System.out.println(key + " --> " + mapColl.get(key));
		// }
		//
		/*-->  Retrun as Collection */
		ClassCollection classColl = jdbcObj.getCallableStmtProcOut1(instance_name);
		System.out.println("Host Name" + classColl.hostName);
		System.out.println("Instance Name" + classColl.instanceName);

		/*-->  Retrun as Ref Cursor */
		// jdbcObj.getCallableStmtProcOutCursor(profile_id);

	}

}
