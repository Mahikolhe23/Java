package tester;

import static utils.IOUtils.RestoreBooks;


import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import code.Books;
import code.Category;
import exception.CustomHandlingException;

public class LibraryManagement {

	public static void main(String[] args) throws CustomHandlingException {
		try (Scanner in = new Scanner(System.in)) {
			// DS for Storing Books with key is String and value is books details
			System.out.println("Enter file Name to read data");
			String fileName = in.nextLine();
			// restore data
			Map<String, Books> books = RestoreBooks(fileName);
			// display map
//			for (Books b : books.values()) {
//				System.out.println(b);
//			}
//			// store books
//			storeBookDetails(fileName, books);

			boolean exit = false;
			// while loop for menu
			while (!exit) {
				System.out.println("Enter choice 1.Adding Book 2.Display Books 3.Remove Books");
				try {
					switch (in.nextInt()) {
					case 1:
						System.out.println("Enter Book Title");
						String BT1 = in.next();
						if (!books.containsKey(BT1)) {
							System.out.println(
									"Enter Book Details :Category(NOVEL, BIOGRAPHY, TECHNICAL, BUSINESS, FINANCE),"
											+ "Price,PublishDate(yyyy-mm-dd),AuthorName,Qty");
							books.put(BT1, new Books(BT1, Category.valueOf(in.next().toUpperCase()), in.nextDouble(),
									LocalDate.parse(in.next()), in.next(), in.nextInt()));
							System.out.println("Books Added Succesfully");
						} else
							throw new CustomHandlingException("Invalid Book details");
						break;
					case 2:
						System.out.println("All Books Details");
						for (Books b : books.values()) {
							System.out.println(b);
						}
						break;
					case 3:
						// Remove Book
						System.out.println("Enter Book Title");
						Books RemoveBook = books.remove(in.nextLine());
						if (RemoveBook == null)
							throw new CustomHandlingException("Invalid book title,Cant fid Book");
						System.out.println("Book Removed" + RemoveBook);
						break;

					case 100:
						// storeBookDetails(fileName, books);
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					in.nextLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
