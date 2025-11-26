package ie.atu.sw;

public class ArraysExample {

	public static void main(String[] args) {

		// Creating an array - fixed size
		
        int[] numbers = new int[5];      // Array of 5 integers
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        // Accessing array elements
        System.out.println("First number: " + numbers[0]);
        System.out.println("Last number: " + numbers[4]);
        
        // Looping through an array
        System.out.println("All numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        // Array shorthand - initialise and populate at once
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        System.out.println("Third fruit: " + fruits[2]); // Cherry
        
        // Enhanced for loop - cleaner when you don't need the index
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        //for loop with i as the index as an example output
        
        for (int i = 0; i < fruits.length; i++) {
        	System.out.println(i + ": " + fruits[i]);
        }

	}

}
