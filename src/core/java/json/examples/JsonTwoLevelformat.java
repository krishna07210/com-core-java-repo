package core.java.json.examples;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;


public class JsonTwoLevelformat {

	public List<Department> displayDeptList() {

		List<Department> deptList = new ArrayList<>();

		deptList.add(new Department(10, "IT", getDeptEmployeeList(10)));
		deptList.add(new Department(20, "HR", getDeptEmployeeList(20)));
		deptList.add(new Department(30, "Accounts", getDeptEmployeeList(30)));
		
		JSONObject obj = new JSONObject();
		
//		obj.putAll(m);
		return deptList;
	}

	public List<Employee> getDeptEmployeeList(int deptno) {

		List<Employee> empList = new ArrayList<>();

		if (deptno == 10) {
			empList.add(new Employee(10, 1001, "Harikrishna", 200000));
			empList.add(new Employee(10, 1002, "Vamikrishna", 500000));
			empList.add(new Employee(10, 1003, "LikithKrishna", 400000));
		} else if (deptno == 20) {
			empList.add(new Employee(20, 2001, "Jeswitha", 100000));

		} else {
			empList.add(new Employee(30, 3001, "Arif", 9000000));
			empList.add(new Employee(30, 3002, "Azam M", 8000000));

		}
		return empList;
	}
}