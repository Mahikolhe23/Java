package utils;

import static utils.SampleBooksDetails.populateBooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import code.Books;
import exception.CustomHandlingException;

public class IOUtils {
	// add static method to store books details
	public static void storeBookDetails(String fileName, Map<String, Books> books)
			throws FileNotFoundException, IOException {
		// create ser chain: java app---->OOS--->FOS(bin file name)
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(books);
			System.out.println("Stored book details successfully");
		}
	}

	// add static method to return populated map having sample data n in case file
	// dosent exist otherwise in case
	// return the map restored from bin file
	@SuppressWarnings("unchecked")
	public static Map<String, Books> RestoreBooks(String fileName)
			throws ClassNotFoundException, IOException, CustomHandlingException {
		File f = new File(fileName);
		// Validate file for read
		if (f.isFile() && f.canRead()) {
			// attached data strms: java app<----OIS<----FIS(bin file Name)
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
				return (Map<String, Books>) in.readObject();
			}
		}
		// no valid file
		System.out.println("Invalid File");
		return populateBooks();// rets map with sample data
	}
}
