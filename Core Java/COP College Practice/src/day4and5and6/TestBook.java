package day4and5and6;

//Q4 Create a class Book with data members as bname,id,author,price. Write
public class TestBook {

	public static void main(String[] args) {
		Book b2 = new Book("Lets c", 150, "Kanetkar", 1999);

		b2.setAuthor("Ram");
		b2.getAuthor();
		b2.display();
	}

}
