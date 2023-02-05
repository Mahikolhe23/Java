package com.app.student;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.pojo.Student;
import com.app.repo.StudentRepo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class StudentTestSample {
	@Autowired
	private StudentRepo studentrepo;

	@Test
	void test() {
		assertNotNull(studentrepo);
	}

	@Test
	void sampleTest() {
		List<Student> list = List.of(
				new Student("Mahi", "kolhe", "mkolhe23@gmail.com", "Mahikolhe", LocalDate.parse("1996-05-23")),
				new Student("komu", "ghorpade", "koko@gmail.com", "komu123", LocalDate.parse("1996-06-27")));
		studentrepo.saveAll(list);
	}
}
