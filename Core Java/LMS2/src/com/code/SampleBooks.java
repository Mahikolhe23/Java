package com.code;

import static java.time.LocalDate.parse;
import java.util.HashMap;
import java.util.Map;
import static com.code.Category.*;

public class SampleBooks {
	// static method for populate books samples
	public static Map<String, Books> populateBooks() throws CustomException {
		Map<String, Books> arr = new HashMap<>();
		arr.put("a10", new Books("abc1", "dk1", 300, 10, DBT, parse("2022-03-15")));
		arr.put("z20", new Books("abc2", "dk2", 400, 20, JAVA, parse("2021-04-19")));
		arr.put("cj15", new Books("abc3", "dk3", 500, 30, FINANCE, parse("2020-02-15")));
		arr.put("mk22", new Books("abc4", "dk4", 600, 40, NOVEL, parse("2019-03-11")));
		arr.put("ok23", new Books("abc5", "dk5", 700, 50, BIOGRAPHY, parse("2018-01-05")));
		arr.put("ok24", new Books("abc6", "dk5", 700, 50, BIOGRAPHY, parse("2018-01-05")));
		arr.put("ok25", new Books("abc7", "dk5", 700, 50, BIOGRAPHY, parse("2018-01-05")));
		return arr;
	}
}
