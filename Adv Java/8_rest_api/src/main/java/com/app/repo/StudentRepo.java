package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojo.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
	List<Student> findByLastNameContaining(String key);

	@Query("select s from Student s where s.email=?1")
	Student getStudentwithEmail(String email);
}
