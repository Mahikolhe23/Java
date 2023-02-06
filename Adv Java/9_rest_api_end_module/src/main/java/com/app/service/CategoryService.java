package com.app.service;

import java.util.List;

import com.app.pojo.Category;
import com.app.pojo.Product;

public interface CategoryService {
	List<Category> getAllCategory();

	String addProductInCategory(Long catID, Product product);
}
