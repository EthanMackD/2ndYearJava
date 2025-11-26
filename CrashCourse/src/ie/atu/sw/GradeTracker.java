package ie.atu.sw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeTracker {
	public static int calculateAverage(List<Integer> grades) {
		int total = 0;
// Step 1: Loop through and add all grades to total
		for (int i = 0; i < grades.size(); i++) {
// Add each grade to total
// Something like: total = total + ???
			total += grades.get(i);
		}
		return total / grades.size();
	}

	public static int findHighest(List<Integer> grades) {
		int highScore = 0;
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i) > highScore) {
				highScore = grades.get(i);
			}
		}
		return highScore;
	}

	public static void displayAll(List<String> names, List<Integer> grades) {

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i) + " " + grades.get(i));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> studentNames = new ArrayList<>();
		List<Integer> studentGrades = new ArrayList<>();

		boolean running = true;

		//set up the main menu for the choices
		
		while (running) {
			System.out.println("Welcome to the menu! Choose an option below:");
			System.out.println("1: Add student");
			System.out.println("2: View all");
			System.out.println("3: Calculate average scores");
			System.out.println("4: Find highest score");
			System.out.println("5: Exit");
			System.out.println("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter student name: ");
				studentNames.add(sc.next());
				
				System.out.println("Enter student grade: ");
			    studentGrades.add(sc.nextInt());
			    sc.nextLine();
			    break;
			case 2:
				displayAll(studentNames, studentGrades);
				break;
			case 3:
				int avg = calculateAverage(studentGrades);
				System.out.println("Average score is: " + avg);
				break;
			case 4:
				int highScore = findHighest(studentGrades);
				System.out.println("The highest score is: " + highScore);
				break;
			case 5:
				running = false;
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}
		sc.close();
	}
}