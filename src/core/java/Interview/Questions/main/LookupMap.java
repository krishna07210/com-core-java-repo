package core.java.Interview.Questions.main;

import java.util.*;

public class LookupMap {

	public static String getProfileStatusDesc(List<Map<String, Object>> list, String ProfStautusCode) {

		String ProfStatusDesc = null;

		for (int i = 0; i < list.size(); i++) {

			for (Map.Entry<String, Object> entry : list.get(i).entrySet()) {
				if (ProfStautusCode == entry.getKey()) {
					System.out.println("Map Lookup 2 - " + entry.getValue());
					ProfStatusDesc = (String) entry.getValue();
				}
			}
		}
		return ProfStatusDesc;
	}

	public static void main(String args[]) {

//		Integer val = 102;
//		Map<Integer, String> map = new HashMap<Integer, String>();
//
//		map.put(100, "Amit");
//		map.put(101, "Vijay");
//		map.put(102, "Rahul");
//
//		List<Map<Integer, String>> list = new ArrayList<Map<Integer, String>>();
//		list.add(map);
//
//		for (Map.Entry m : map.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//
//			if (val == m.getKey()) {
//				System.out.println("Map Lookup -" + m.getValue());
//			}
//		}

//		for (int i = 0; i < list.size(); i++) {
//			String key = null;
//			int value = 0;
//			for (Map.Entry<Integer, String> entry : list.get(i).entrySet()) {
//				if (val == entry.getKey()) {
//					System.out.println("Map Lookup 2-" + entry.getValue());
//				}
//			}
//		}

		Map<String, String> map = new HashMap<String, String>();

		map.put("DS_CURRENT", "Current");
		map.put("DS_CLOSED", "Closed");
		map.put("DS_PIPELINE", "Pipeline");

//		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//		list.add(map);

//		String ProfStatusCode = "DS_CURRENT";
//		String ProfStatusDesc = getProfileStatusDesc(list,ProfStatusCode);
		
		String lookup =  map.get("DS_CURRENTr");
		System.out.println("Get Value " +lookup);
		
		if (lookup.toUpperCase().equals("Current") && lookup != null) {
			System.out.println("Equal");
		}
		
//		System.out.println("ProfStatusDesc - "+ ProfStatusDesc);

	}

}
