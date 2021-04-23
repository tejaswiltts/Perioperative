package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.model.Employee;



@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepository;
	public List<Employee> getAllEmployee()   
	{  
	List<Employee> employee = new ArrayList<Employee>();  
	employeeRepository.findAll().forEach(employee1 -> employee.add(employee1));  
	return employee;  
	}
	public Employee getEmployeeById(int emp_id)   
	{  
	return employeeRepository.findById(emp_id).get();  
	}  
	public void saveOrUpdate(Employee employee)   
	{  
	employeeRepository.save(employee);  
	} 
	public void delete(int emp_id)   
	{  
	employeeRepository.deleteById(emp_id);  
	} 
	public void update(Employee employee, int emp_id)   
	{  
	employeeRepository.save(employee);  
	} 
}
