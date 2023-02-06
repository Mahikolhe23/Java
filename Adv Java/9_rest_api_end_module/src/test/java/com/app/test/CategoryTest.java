package com.app.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.pojo.Category;
import com.app.repo.CategoryRepo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class CategoryTest {
	@Autowired
	private CategoryRepo categoryrepo;

	@Test
	void test() {
		assertNotNull(categoryrepo);
	}

	@Test
	void categoryTest() {
		List<Category> list = List.of(new Category("Snacks", "Healthy", "Snacks khao body banavo"),
				new Category("Fruits", "Sweet", "Body-builder lok yaha mat aao"));
		categoryrepo.saveAll(list);
	}
}
