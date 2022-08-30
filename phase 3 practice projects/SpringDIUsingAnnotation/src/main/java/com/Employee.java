package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component                        //<bean class="com.Employee"></bean> id name is emp
//@Scope("Singleton")
//@Scope("prototype")
public class Employee {
	@Value(value = "100")
	private int id;
	@Value(value = "ravi")
	private String name;
	@Value(value = "20000")
	private float salary;
	@Autowired
	private Address add;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("object created");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}
	

}
