package com.code;

import java.time.LocalDate;

public class Books {
	private String title;
	private String authorName;
	private double price;
	private int qty;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	private Category category;
	private LocalDate publishDate;

	public Books(String title, String authorName, double price, int qty, Category category, LocalDate publishDate) {
		this.title = title;
		this.authorName = authorName;
		this.price = price;
		this.qty = qty;
		this.category = category;
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "Books [title=" + title + ", authorName=" + authorName + ", price=" + price + ", qty=" + qty
				+ ", category=" + category + ", publishDate=" + publishDate + "]";
	}

}
