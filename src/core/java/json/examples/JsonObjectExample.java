package core.java.json.examples;

import org.json.simple.JSONObject;

public class JsonObjectExample {

	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("name", "harikrishna");
		obj.put("age", "32");
		obj.put("address", "Hyderabad");
		obj.put("salary",new Integer(30000));
		obj.put("height",new Double(175.5));
		System.out.println(obj);
	}

}
