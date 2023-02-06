package com.app.service;

import java.util.List;

import com.app.pojo.Employee;

public interface EmpService {
	List<Employee> getAllEmp();

	Employee saveEmp(Employee emp);

	Employee getEmpbyID(long id);

	String deleteById(long id);

	Employee updateEmp(Employee emp);
}
