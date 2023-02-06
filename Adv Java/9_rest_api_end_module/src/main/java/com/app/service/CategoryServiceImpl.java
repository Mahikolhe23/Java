package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojo.Category;
import com.app.pojo.Product;
import com.app.repo.CategoryRepo;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepo categoryrepo;

	@Override
	public List<Category> getAllCategory() {
		return categoryrepo.findAll();
	}

	@Override
	public String addProductInCategory(Long catID, Product product) {
		Category category = categoryrepo.findById(catID).orElseThrow();
		if (category != null) {
			category.addProducts(product);
			return "Product added success";
		}
		return "Failed to add";
	}
}
