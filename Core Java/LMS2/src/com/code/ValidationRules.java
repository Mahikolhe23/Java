package com.code;

import java.time.LocalDate;

public class ValidationRules {
	// Method for Validate Category
	public static String validateCategory(String category) throws CustomException {
		if (Category.values().toString().equals(category))
			return category;
		throw new CustomException("Category not Found");
	}

	public static LocalDate validatePD(LocalDate DT) throws CustomException {
		LocalDate d = LocalDate.parse("2017-01-01");
		if (DT.isAfter(d))
			return DT;
		throw new CustomException("Books are too old");
	}
}
