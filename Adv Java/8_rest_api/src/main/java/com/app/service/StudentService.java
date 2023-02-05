package com.app.service;

import java.util.List;

import com.app.pojo.Student;

public interface StudentService {
	List<Student> getAllStudent();

	Student saveStudentDetails(Student student);

	String deleteStudentById(long id);

	Student getStudentById(long id);

	Student upateStudentDetails(Student student);
}
