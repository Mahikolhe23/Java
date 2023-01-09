package day4and5and6;

//Q4 Create a class Book with data members as bname,id,author,price. Write

public class Book {
	private String bname;
	private int id;
	private String author;
	private int price;

	public Book() {
		bname = "Basic Java";
		id = 1234;
		author = "PK Jadhav";
		price = 999;
	}

	public Book(String bname, int id, String author, int price) {
		this.bname = bname;
		this.id = id;
		this.author = author;
		this.price = price;
	}

	public String getBname() {
		return this.bname;
	}

	public int getId() {
		return this.id;
	}

	public String getAuthor() {
		return this.author;
	}

	public int getPrice() {
		return this.price;
	}

	public void setName(String name) {
		this.bname = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void display() {
		System.out.println(
				"Book-Name: " + bname + "\nAuthor Name: " + author + "\nBook-Id: " + id + "\nPrice: " + price + "\n");
	}
}
