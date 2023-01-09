package code;

import java.time.LocalDate;

public class Shoe {
	private int ID;
	private Category category;
	private LocalDate listDate;
	private int stock = 0;
	private LocalDate stockUpdateDate;
	private double size;
	private double price;
	private Color color;
	private double discount;
	private static int counter;
	private Type gender;

	public Shoe(Category category, LocalDate listDate, int stock, LocalDate stockUpdateDate, double size, double price,
			Color color, double discount, Type gender) {
		ID = counter;
		this.category = category;
		this.listDate = listDate;
		this.stock = stock;
		this.stockUpdateDate = stockUpdateDate;
		this.size = size;
		this.price = price;
		this.color = color;
		this.discount = discount;
		this.gender = gender;
		counter++;
	}

	static {
		counter = 1;
	}

	@Override
	public String toString() {
		return "Shoe [ID=" + ID + ", category=" + category + ", listDate=" + listDate + ", stock=" + stock
				+ ", stockUpdateDate=" + stockUpdateDate + ", size=" + size + ", price=" + price + ", color=" + color
				+ ", discount=" + discount + ", gender=" + gender + "]";
	}

	public void setStock(int stock) {
		this.stock = this.stock + stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getID() {
		return ID;
	}

	public Category getCategory() {
		return category;
	}

	public LocalDate getListDate() {
		return listDate;
	}

	public int getStock() {
		return stock;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public double getSize() {
		return size;
	}

	public Color getColor() {
		return color;
	}

	public Type getGender() {
		return gender;
	}
}
