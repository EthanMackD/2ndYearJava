package project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

	public static void displayAllTasks(List<String> tasks, List<Boolean> isComplete) {

		for (int i = 0; i < tasks.size(); i++) {

			String status = isComplete.get(i) ? "Completed" : "Incompleted";

			System.out.println(tasks.get(i) + ": " + status);
		}
	}

	public static void addTask(List<String> tasks, List<Boolean> isComplete, String description) {

		tasks.add(description);
		isComplete.add(false);

		System.out.println("The task " + description + " was added to the to-do list!");
	}

	public static void completeTask(List<String> tasks, List<Boolean> isComplete, int taskNum) {

		int position = taskNum - 1;

		if (position == -1) {
			System.out.println("Task not found");
		}
		if (isComplete.get(position) == true) {
			System.out.println("Task is already completed");
			return;
		}
		isComplete.set(position, true);
		System.out.println("Task completed successfully!");
	}

	public static void deleteTask(List<String> tasks, List<Boolean> isComplete, int taskNum) {

		int position = taskNum - 1;

		if (position == -1) {
			System.out.println("Task does not exist");
		}
		if (isComplete.get(position) == true) {
			System.out.println("Task is already completed.");
		}
// isComplete.set(position, true);
		tasks.remove(position);
		isComplete.remove(position);
		System.out.println("Task deleted successfully!");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> tasks = new ArrayList<>();
		List<Boolean> isComplete = new ArrayList<>();

		tasks.add("Take the trash out");
		tasks.add("Get the shopping done");
		tasks.add("Walk the dog");

		isComplete.add(false);
		isComplete.add(false);
		isComplete.add(false);

//Create menu with 5 steps like previous projects
		boolean running = true;

//set up the main menu for the choices
		while (running) {
			System.out.println("Welcome to the Task manager! Choose an option below:");
			System.out.println("1: Add task");
			System.out.println("2: View all tasks");
			System.out.println("3: Mark tasks as complete");
			System.out.println("4: Delete tasks");
			System.out.println("5: Exit");
			System.out.println("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the task you wish to add: ");
				String description = sc.next();
				sc.nextLine();
				addTask(tasks, isComplete, description);
				break;
			case 2:
				displayAllTasks(tasks, isComplete);
				break;
			case 3:
				System.out.println("Choose which task you wish to mark as completed: ");
				int taskToComplete = sc.nextInt();
				completeTask(tasks, isComplete, taskToComplete);
				break;
			case 4:
				System.out.println("Choose which task you wish to delete: ");
				int deleteTask = sc.nextInt();
				deleteTask(tasks, isComplete, deleteTask);
				break;
			case 5:
				running = false;
				break;
			}
		}
		sc.close();
	}

}