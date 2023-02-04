package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Student;
import com.app.repository.StudentRepo;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}
}
