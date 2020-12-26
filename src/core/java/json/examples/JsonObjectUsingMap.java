package core.java.json.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonObjectUsingMap {
	public static void main(String args[]) {
		Map obj = new HashMap();

		obj.put("name", "sonoo");
		obj.put("age", new Integer(27));
		obj.put("salary", new Double(600000));
		String jsonText = JSONValue.toJSONString(obj);
		System.out.println(jsonText);

		List arr = new ArrayList();

		arr.add("sonoo");
		arr.add(new Integer(27));
		arr.add(new Double(600000));
		String jsonText1 = JSONValue.toJSONString(arr);
		System.out.println(jsonText1);

		String s = "{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";

		Object obj2 = JSONValue.parse(s);

		System.out.println(obj2);

		JSONObject jsonObject = (JSONObject) obj2;

		String name = (String) jsonObject.get("name");
		double salary = (Double) jsonObject.get("salary");
		long age = (Long) jsonObject.get("age");
		System.out.println(name + " " + salary + " " + age);
	}
}