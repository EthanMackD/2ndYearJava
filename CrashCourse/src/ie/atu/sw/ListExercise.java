package ie.atu.sw;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

	public static void main(String[] args) {

		List<String> studentNames = new ArrayList<>();
		
		studentNames.add("John");
		studentNames.add("Brian");
		studentNames.add("Mick");
		studentNames.add("Tony");
		studentNames.add("Tom");
		
		System.out.println(studentNames);
		
		studentNames.remove(2);
		System.out.println(studentNames);

		
		
		if (studentNames.contains("Alice")) {
			System.out.println("There is an Alice here");
		}
		else {
			System.out.println("There is no Alice here");
		}

		
	}

}
