package collection;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		super();
		
	}
	
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ","
				+ " empName=" + empName + ", salary=" + salary + "]";
	}

	public void display() {
		
		
	}
	

}
