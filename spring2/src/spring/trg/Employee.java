package spring.trg;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int empId;
	private String name;
	private float salary;
	
	@Autowired
	private Department  dept;

	public Employee(int empId, String name, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "EmpId=" + empId + ", name=" + name + ", salary=" + salary + ", dept=" + dept ;
	}


	
	
	
}
