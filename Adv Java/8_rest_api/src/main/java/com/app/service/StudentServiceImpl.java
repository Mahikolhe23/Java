package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.exception.CustomExpception;
import com.app.pojo.Student;
import com.app.repo.StudentRepo;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo studentrepo;

	@Override
	public List<Student> getAllStudent() {
		return studentrepo.findAll();
	}

	@Override
	public Student saveStudentDetails(Student student) {
		return studentrepo.save(student);
	}

	@Override
	public String deleteStudentById(long id) {
		if (studentrepo.existsById(id)) {
			studentrepo.deleteById(id);
			return "Student Deleted Successufully!!!!!!!!!!!";
		}
		return "Student not Found";
	}

	@Override
	public Student getStudentById(long id) {
		return studentrepo.findById(id).orElseThrow();
	}

	@Override
	public Student upateStudentDetails(Student student) {
		if (studentrepo.existsById(student.getId())) {
			return studentrepo.save(student);
		}
		throw new CustomExpception("Student not FOund");
	}
}
