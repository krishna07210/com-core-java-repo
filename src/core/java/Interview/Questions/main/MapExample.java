package core.java.Interview.Questions.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String args[]) {

		Map<String, Object> input = new HashMap<>();

		// input.put("profileIds", "42443,42444");

//		List<Integer> profileIdList = new ArrayList<Integer>();
//        if(input.get("profileIds") != null) { 
//        	profileIdList = (List<Integer>) input.get("profileIds");
//        }
//        
		//System.out.println(input.get("profileIds"));

		List<Integer> profileIdList = new ArrayList<Integer>();

		profileIdList = (List<Integer>) input.get("profileIds");

		input.put("bootstrap.servers", "localhost:9092");
		input.put("bootstrap.servers", "localhost:9092");

		List<Map<String, Object>> inputList = new ArrayList<Map<String, Object>>();

		inputList.add(input);

		List<Map<String, Object>> proplist = new ArrayList<Map<String, Object>>();
		Map<String, Object> returnMap = new HashMap<>();

		for (int i = 0; i < inputList.size(); i++) {

			for (Map.Entry<String, Object> entry : inputList.get(i).entrySet()) {

				String propName = entry.getKey();
				Object propValue = entry.getValue();

				returnMap.put(propName, propValue);
			}
		}

		String propName = (String) returnMap.get("bootstrap.servers"); 
		
		System.out.println(propName);
 

	}
}
