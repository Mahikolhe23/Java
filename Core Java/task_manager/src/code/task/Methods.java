package code.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Methods {
	// Method for sorting as per task Date
	public static ArrayList<Task> sortByTaskDate(ArrayList<Task> arr) {
		Collections.sort(arr, new Comparator<Task>() {
			@Override
			public int compare(Task o1, Task o2) {
				return o1.getTaskDate().compareTo(o2.getTaskDate());
			}
		});
		return arr;
	}

	// Method for sorting as per task name
	public static ArrayList<Task> tasksortbyName(ArrayList<Task> list) {
		Collections.sort(list, new Comparator<Task>() {

			@Override
			public int compare(Task o1, Task o2) {
				return o1.getTaskName().compareTo(o2.getTaskName());
			}
		});
		return list;
	}
}
