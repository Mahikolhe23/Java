package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:8080")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/list")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}

	@PostMapping
	public Student saveStudentDetails(@RequestBody Student student) {
		return studentService.saveStudentDetails(student);
	}

	@DeleteMapping("/{id}")
	public String deleteStudentById(@PathVariable long id) {
		return studentService.deleteStudentById(id);
	}

	@GetMapping("/{id}")
	public Student getStudentByID(@PathVariable long id) {
		return studentService.getStudentById(id);
	}

	@PutMapping
	public Student updateStudentDetail(@RequestBody Student student) {
		return studentService.upateStudentDetails(student);
	}

	@GetMapping("/last_name/{key}")
	public ResponseEntity<?> getStudentByName(@PathVariable String key) {
		List<Student> list = studentService.getStudentByName(key);
		if (list.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} else
			return ResponseEntity.ok(list);
	}

	@GetMapping("/email/{email}")
	public Student getStudentByEmail(@PathVariable String email) {
		return studentService.getStudentByEmail(email);
	}
}
