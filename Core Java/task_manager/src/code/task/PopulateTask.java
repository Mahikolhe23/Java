package code.task;

import java.time.LocalDate;
import java.util.ArrayList;

public class PopulateTask {
	// Static Method to Populate
	public static ArrayList<Task> populateList() {
		ArrayList<Task> task = new ArrayList<Task>();
		task.add(new Task("cBC1", "AAABBBCCC1", LocalDate.parse("2022-01-01")));
		task.add(new Task("ABC2", "AAABBBCCC2", LocalDate.parse("2022-02-02")));
		task.add(new Task("SBC3", "AAABBBCCC3", LocalDate.parse("2022-03-03")));
		task.add(new Task("GBC4", "AAABBBCCC4", LocalDate.parse("2019-04-04")));
		task.add(new Task("oBC5", "AAABBBCCC5", LocalDate.parse("2018-05-05")));
		return task;
	}

	// validate task name-char 10
	public static String validateName(String name) throws CustomException {
		if (name.length() < 10) {
			return name;
		} else
			throw new CustomException("Name must less than 10 char");
	}

	// validate task desc-15 char
	public static String validateDesc(String name) throws CustomException {
		if (name.length() < 15) {
			return name;
		} else
			throw new CustomException("Name Should be Less than 15");
	}

	// date validation
	public static LocalDate validateDate(LocalDate d) throws CustomException {
		LocalDate dd = LocalDate.now();
		LocalDate dm = dd.minusMonths(6);
		if (d.isAfter(dm)) {
			return d;
		} else
			throw new CustomException("TOO OLD TASK");
	}

	public static Task addNewTask(String name, String desc, LocalDate d) throws CustomException {
		validateName(name);
		validateDesc(desc);
		validateDate(d);
		return new Task(name, desc, d);
	}
}
