package com.app.repo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.pojos.Student;
import com.app.repository.StudentRepo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class TestSampleData {
	@Autowired
	private StudentRepo stunRepo;

	@Test
	void test() {
		assertNotNull(stunRepo);
	}

	@Test
	void testAddStudent() {
		List<Student> list = List.of(new Student("Mahi", "Kolhe", "Mahikolhe", "mkolhe23@gmail.com", "7350458043",
				LocalDate.parse("1996-05-23")));
		stunRepo.saveAll(list);
	}
}
