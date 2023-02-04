package com.app.repo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.pojo.Employee;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class UnitTest {

	@Autowired
	private EmployeeRepo empRepo;

	@Test
	void test() {
//		assertNotNull(empRepo);
	}

	@Test
	void testEmp() {
		List<Employee> allEmp = List.of(new Employee(), new Employee());
		empRepo.saveAll(allEmp);
	}
}
