package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Employee;
import com.app.service.EmpService;

@RestController
@RequestMapping("/Student")
public class EmpController {
	@Autowired
	private EmpService empservice;

	@GetMapping("/list")
	public List<Employee> getAllEmp() {
		return empservice.getAllEmp();
	}

	@PostMapping
	public Employee saveEmp(@RequestBody Employee emp) {
		return empservice.saveEmp(emp);
	}

	@GetMapping("/emp/{id}")
	public Employee getEmpbyID(@PathVariable long id) {
		return empservice.getEmpbyID(id);
	}

	@DeleteMapping("/emp/{id}")
	public String delelteEmpbyId(@PathVariable long id) {
		return empservice.deleteById(id);
	}

	@PutMapping
	public Employee updateEmp(@RequestBody Employee emp) {
		return empservice.updateEmp(emp);
	}
}
