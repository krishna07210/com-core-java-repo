package core.java.Interview.Questions.main;

import java.util.*;

public class RuntimeClassCastException {

	public static void main(String[] args) {
		List list = new ArrayList<>();

		list.add("Hari");
		list.add(new Integer(10));

//		for (Object obj : list) {
//			String str = (String) obj;
//			System.out.println(obj);
//		}
//		
		/*
		 * Hari Exception in thread "main" java.lang.ClassCastException:
		 * java.lang.Integer cannot be cast to java.lang.String at
		 * core.java.Interview.Questions.RuntimeClassCastException.main(
		 * RuntimeClassCastException.java:15)
		 */

		List<String> list1 = new ArrayList<String>();
		list1.add("Hari");
//		list1.add(new Integer(10));

		for (String s : list1) {
			System.out.println(s);

		}

	}

}
