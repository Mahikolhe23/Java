package code.task;

import static java.time.LocalDate.parse;
import static code.task.PopulateTask.addNewTask;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws CustomException {
		ArrayList<Task> task = PopulateTask.populateList();
		try (Scanner in = new Scanner(System.in)) {
			boolean exit = false;
			while (!exit) {
				System.out.println("Enter choice for specific option");
				System.out.println("1) Add New Task\r\n" + "2) Delete a task\r\n" + "3) Update task status\r\n"
						+ "4) Display all pending tasks\r\n" + "5) Display all pending tasks for today\r\n"
						+ "6) Display all tasks sorted by taskDate\r\n" + "7) Display all task\r\n");
				try {
					switch (in.nextInt()) {
					case 1:
						System.out.println("Enter Details : taskName, description, taskDate(YYYY-MM-DD)");
						Task t1 = addNewTask(in.next(), in.next(), parse(in.next()));
						task.add(t1);
						System.out.println("Task added Successfully");
						break;
					case 2:
						System.out.println("Enter task Id to Delete task");
						int newId = in.nextInt();
						int counter = 0;
						for (int i = 0; i < task.size(); i++) {
							if (task.get(i).getTaskID() == newId) {
								task.get(i).setActive();
								System.out.println("Task is Removed successfully : ");
								counter++;
							}
						}
						if (counter == 0) {
							throw new CustomException("ID Not Found");
						}
						break;
					case 3:
						System.out.println("Enter Id to Udpate status");
						newId = in.nextInt();
						counter = 0;
						for (int i = 0; i < task.size(); i++) {
							if (task.get(i).getTaskID() == newId) {
								System.out.println("Update Status as : IN_PROGRESS OR COMPLETED");
								task.get(i).setStatus(Status.valueOf(in.next().toUpperCase()));
								System.out.println("Status Update Successfully");
								counter++;
							}
						}
						if (counter == 0) {
							throw new CustomException("ID Not Found");
						}
						break;
					case 4:
						System.out.println("All Pending Task : ");
						for (Task t : task) {
							if (t.getStatus().equals(Status.PENDING)) {
								System.out.println(t.toString());
							}
						}
						break;
					case 5:
						System.out.println("Enter Date to Show Pending Task");
						LocalDate d = LocalDate.parse(in.next());
						for (Task t : task) {
							if (t.getTaskDate().isEqual(d) && t.getStatus().equals(Status.PENDING)) {
								System.out.println(t.toString());
							}
						}
						break;
					case 6:
						System.out.println("Sorted By Task Date :");
						ArrayList<Task> list = Methods.sortByTaskDate(task);
						for (Task t : list) {
							System.out.println(t.toString());
						}
						break;
					case 7:
						for (Task t : task) {
							System.out.println(t.toString());
						}
						break;
					case 8:
						System.out.println("Asc by Task NAme");
						ArrayList<Task> l = Methods.tasksortbyName(task);
						for (Task task2 : l) {
							System.out.println(task2.toString());
						}
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
