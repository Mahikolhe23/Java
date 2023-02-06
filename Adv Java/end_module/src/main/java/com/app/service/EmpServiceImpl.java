package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.customException.CustomException;
import com.app.pojo.Employee;
import com.app.repo.EmpRepo;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpRepo emprepo;

	@Override
	public List<Employee> getAllEmp() {
		return emprepo.findAll();
	}

	@Override
	public Employee saveEmp(Employee emp) {
		return emprepo.save(emp);
	}

	@Override
	public Employee getEmpbyID(long id) {
		return emprepo.findById(id).orElseThrow();
	}

	@Override
	public String deleteById(long id) {
		if (emprepo.existsById(id)) {
			emprepo.deleteById(id);
			return "Emp deleted Success";
		}
		return "Emp Not Found";
	}

	@Override
	public Employee updateEmp(Employee emp) {
		return emprepo.save(emp);
	}
}
