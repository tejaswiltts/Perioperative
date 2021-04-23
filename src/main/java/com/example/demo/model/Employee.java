package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	private int emp_id;
	@Column
	private String emp_name;
	@Column
	private String role;
	@Column
	private String department;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(int emp_id, String emp_name, String role, String department) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.role = role;
		this.department = department;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", role=" + role + ", department=" + department
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


	