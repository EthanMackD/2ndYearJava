package ie.atu.sw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicCollections {

	public static void main(String[] args) {

		// ArrayList - grows and shrinks automatically
		// Create an empty box called cities that will hold text.
		List<String> cities = new ArrayList<>();
        
        // Adding elements - Putting 3 cities into the empty box
        cities.add("Dublin");
        cities.add("Cork");
        cities.add("Galway");
        
        // Getting elements
        System.out.println("First city: " + cities.get(0));
        System.out.println("List size: " + cities.size());
        
        // Removing elements
        cities.remove(1);  // Removes "Cork"
        
        // Looping through a list
        for (String city : cities) {
            System.out.println(city);
        }
        
        // List of numbers
        List<Integer> scores = new ArrayList<>(Arrays.asList(85, 90, 78));
//        scores.add(85);
//        scores.add(90);
//        scores.add(78);
        
        // Checking if list contains something
        if (scores.contains(90)) {
            System.out.println("Score of 90 found!");
        }
        if (cities.contains("Dublin")) {
        	System.out.println("Dublin is here!");
        }

	}

}
