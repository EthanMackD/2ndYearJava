package ie.atu.sw;

public class CrashCourseExercises {
	
	public static void main(String[] args) {
		
//		int[] numbers = new int [5];
//		numbers[0] = 250;
//		numbers[1] = 648;
//		numbers[2] = 195;
//		numbers[3] = 45;
//		numbers[4] = 674;
		
		//same as above
		int[] numbers = {250, 648, 195, 45, 674};
		int totalSum = 0;
		int maxNum = numbers[0];
		int smallNum = numbers[0];
		
		
		//finding the sum of all numbers in the array

		for (int i = 0; i < numbers.length; i++) {
			totalSum += numbers[i];
		}
		
		System.out.println("Sum of all numbers is: " + totalSum);

		// Update: If the current 'number' is greater than our current 'maximum',
	    // then we have found a new largest number.
		for (int number : numbers) {
			if (number > maxNum) {
				maxNum = number; // Update 'maximum' to the new value
			}
		}
		
		System.out.println("The largest number is: " + maxNum);
		
		
		for (int number : numbers) {
			if (number < smallNum) {
				smallNum = number; // Update 'minimum' to the new value
			}
		}
		
		System.out.println("The smallest number is: " + smallNum);

	}
}
