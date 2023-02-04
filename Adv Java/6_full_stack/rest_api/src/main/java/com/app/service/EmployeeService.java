package com.app.service;

import java.util.List;

import com.app.pojo.Employee;

public interface EmployeeService {
	// get all emps
	List<Employee> getAllEmp();

	Employee addNewEmp(Employee emp);
}
