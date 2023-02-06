package com.app.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {
	@Column(length = 20)
	private String categoryName;
	@Column(length = 20)
	private String categoryType;
	@Column(length = 50)
	private String categoryDesc;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "category")
	private List<Product> products = new ArrayList<>();

	public Category() {
	}

	public Category(String categoryName, String categoryType, String categoryDesc) {
		super();
		this.categoryName = categoryName;
		this.categoryType = categoryType;
		this.categoryDesc = categoryDesc;
	}

	@Override
	public String toString() {
		return "Category Id" + getId() + "[categoryName=" + categoryName + ", categoryType=" + categoryType
				+ ", categoryDesc=" + categoryDesc + "]";
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	// helper method for adding products in category
	public void addProducts(Product product) {
		products.add(product);
		product.setCategory(this);
	}

	// helper method for removing products
	public void removeProduct(Product p) {
		products.remove(p);
		p.setCategory(null);
	}
}
