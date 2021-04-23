package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.model.Employee;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {
	@RequestMapping(value = "/employee", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> firstPage() {
		return employeeService.getAllEmployee();
	}
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/employee")  
	private List<Employee> getAllEmployee()   
	{  
	return employeeService.getAllEmployee();  
	}
	@GetMapping("/employee/{emp_id}")  
	private Employee getEmployee(@PathVariable("emp_id") int emp_id)   
	{  
	return employeeService.getEmployeeById(emp_id);  
	} 
	@DeleteMapping("/employee/{emp_id}")  
	private void deleteEmployee(@PathVariable("emp_id") int emp_id)   
	{  
	employeeService.delete(emp_id);  
	}
	@PostMapping("/employee")  
	private int saveEmployee(@RequestBody Employee employee)   
	{  
	employeeService.saveOrUpdate(employee);  
	return employee.getEmp_id();  
	} 
	@PutMapping("/employee")  
	private Employee update(@RequestBody Employee employee)   
	{  
	employeeService.saveOrUpdate(employee);  
	return employee;  
	}

}