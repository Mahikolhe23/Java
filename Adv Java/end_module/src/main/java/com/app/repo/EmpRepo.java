package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {

}
