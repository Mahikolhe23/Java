package com.code;

import static com.code.SampleBooks.populateBooks;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LMS {

	public static void main(String[] args) throws CustomException {
		// populate books details
		Map<String, Books> books = populateBooks();
		try (Scanner in = new Scanner(System.in)) {
			// loop condition
			boolean exit = false;
			while (!exit) {
				System.out.println("Enter choice for Operation");
				System.out.println(
						"1.Add Book 2.Display Books 3. Delete Book 4.Sort Book by Title 5.By Author Name 6.By Category Books 7.By Publish Date");
				try {
					switch (in.nextInt()) {
					case 1:
						System.out.println("Enter Book Title");
						String newBook = in.next();
						if (!books.containsKey(newBook)) {
							System.out.println(
									"Enter details as : Title, Author ,Price, Qty, Category(JAVA, DBT, FINANCE, NOVEL, BIOGRAPHY),Publish Date(yyyy-mm-dd)");
							books.put(newBook, new Books(newBook, in.next(), in.nextDouble(), in.nextInt(),
									Category.valueOf(in.next().toUpperCase()), LocalDate.parse(in.next())));
							System.out.println("Book Added to Collection");

						} else
							throw new CustomException("Book Details Invalid");

						break;
					case 2:
						System.out.println("All Books Details : ");
						for (Books b : books.values()) {
							System.out.println(b.toString());
						}
						break;
					case 3:
						System.out.println("Enter Book Title to Remove");
						Books b = books.remove(in.next());
						if (b == null)
							throw new CustomException("Invalid Book Title");
						System.out.println("Removed Book is :" + b);
						break;
					case 4:
						System.out.println("Sorted Books by Title");
						TreeMap<String, Books> t = new TreeMap<String, Books>();
						t.putAll(books);
						for (Map.Entry<String, Books> entry : t.entrySet())
							System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
						break;
					case 5:
						System.out.println("Enter Author Name to Display Book");
						String AN = in.next();
						for (Books m : books.values()) {
							if (m.getAuthorName().equals(AN)) {
								System.out.println("Book Title is : " + m.getTitle());
							} else
								throw new CustomException("Author Not Found");
						}
						break;
					case 6:
						System.out.println("Enter Category to display all books");
						String c = in.next();
						for (Books m1 : books.values()) {
							if (m1.getCategory().toString().equals(c)) {
								System.out.println(m1.toString());
							} else
								throw new CustomException("Category Not Found");
						}
						break;
					case 7:
						System.out.println("Enter the Date in YYYY-MM-DD to Display Books");
						LocalDate dt = LocalDate.parse(in.next());
						System.out.println(dt);
						for (Books d : books.values()) {
							if (d.getPublishDate().isEqual(dt)) {
								System.out.println("Book Details : " + d.toString());
							} else
								throw new CustomException("Publish Date Not Found");
						}
						break;
					case 8:
						// System.out.println(ValidationRules.validateCategory(in.next()));
						System.out.println(ValidationRules.validatePD(LocalDate.parse("2015-01-01")));
						break;
					}
				} catch (Exception e) {
					in.nextLine();
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
