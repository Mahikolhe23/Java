package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Product;
import com.app.service.CategoryService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private CategoryService categoryservice;

	@PostMapping("/category/{id}")
	public String addProduct(@PathVariable long id, @RequestBody Product product) {
		return categoryservice.addProductInCategory(id, product);
	}
}
