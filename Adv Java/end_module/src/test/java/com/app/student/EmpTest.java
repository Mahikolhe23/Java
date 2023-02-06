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

import com.app.pojo.Employee;
import com.app.repo.EmpRepo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class EmpTest {
	@Autowired
	private EmpRepo emprepo;

	@Test
	void test() {
		assertNotNull(emprepo);
	}

	@Test
	void addTest() {
		List<Employee> list = List.of(
				new Employee("Mahi", "kolhe", "mkolhe23@gmail.com", "Mahikolhe", LocalDate.parse("1996-05-23")),
				new Employee("sujay", "mathane", "sujay@gmail.com", "sujay123", LocalDate.parse("1996-12-31")));
		emprepo.saveAll(list);
	}
}
