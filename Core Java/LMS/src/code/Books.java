package code;

import java.io.Serializable;
import java.time.LocalDate;

public class Books implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bookTitle;
	private Category category;
	private double price;
	private LocalDate publishDate;
	private String authorName;
	private int qty;

	public Books(String bookTitle, Category category, double price, LocalDate publishDate, String authorName, int qty) {
		this.bookTitle = bookTitle;
		this.category = category;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book Details [bookTitle=" + bookTitle + ", category=" + category + ", price=" + price + ", publishDate="
				+ publishDate + ", authorName=" + authorName + ", qty=" + qty + "]";
	}

}
