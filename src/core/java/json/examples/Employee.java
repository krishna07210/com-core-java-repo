package core.java.json.examples;

public class Employee {
	private int deptNo;
	private int empID;
	private String ename;
	private int salary;

	public Employee(int deptNo, int empID, String ename, int salary) {
		super();
		this.deptNo = deptNo;
		this.empID = empID;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [deptNo=" + deptNo + ", empID=" + empID + ", ename=" + ename + ", salary=" + salary + "]";
	}

	
}
