package com.app.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;

@Entity
@Table(name = "products")
public class Product extends BaseEntity {
	@Column(length = 20, nullable = false)
	private String productName;
	@Column(length = 20)
	private String productDesc;
	@Future
	private LocalDate expDate;
	@Min(value = 100)
	private double unitPrice;
	@Min(value = 1)
	private int qty;
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	public Product() {
	}

	public Product(String productName, String productDesc, @Future LocalDate expDate, double unitPrice, int qty) {
		super();
		this.productName = productName;
		this.productDesc = productDesc;
		this.expDate = expDate;
		this.unitPrice = unitPrice;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Product ID" + getId() + " [productName=" + productName + ", productDesc=" + productDesc + ", expDate="
				+ expDate + ", unitPrice=" + unitPrice + ", qty=" + qty + "]";
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
