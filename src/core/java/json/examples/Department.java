package core.java.json.examples;

import java.util.List;

public class Department {

	private int deptno;
	private String deptName;
	private List<Employee> empList ;

	public Department(int deptno, String deptName, List<Employee> empList) {
		super();
		this.deptno = deptno;
		this.deptName = deptName;
		this.empList = empList;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

}
