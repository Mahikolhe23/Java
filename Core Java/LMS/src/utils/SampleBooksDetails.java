package utils;

import static java.time.LocalDate.parse;

import java.util.HashMap;
import java.util.Map;
import code.Books;
import static code.Category.*;
import exception.CustomHandlingException;

public class SampleBooksDetails {
	// Adding static method of Books Sample For testing
	public static Map<String, Books> populateBooks() throws CustomHandlingException {
		Map<String, Books> books = new HashMap<>();
		books.put("abc1", new Books("abc1", BIOGRAPHY, 1000, parse("2022-05-06"), "MKG1", 10));
		books.put("abc2", new Books("abc2", TECHNICAL, 1100, parse("2021-01-09"), "MKG2", 20));
		books.put("abc3", new Books("abc3", BUSINESS, 1200, parse("2020-12-06"), "MKG3", 35));
		books.put("abc4", new Books("abc4", FINANCE, 1300, parse("2019-07-06"), "MKG4", 16));
		books.put("abcd5", new Books("abcd5", NOVEL, 1400, parse("2018-04-22"), "MKG5", 30));
		return books;
	}
}
