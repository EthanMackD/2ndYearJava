package ie.atu.sw;

public class MethodExercise {

	// Check if a number is prime
	public static boolean isPrime(int num) {
	    if (num < 2) {
	        return false;  // Numbers less than 2 aren't prime
	    }
	    
	    // Check if any number from 2 to num-1 divides evenly
	    for (int i = 2; i < num; i++) {
	        if (num % i == 0) {
	            return false;  // Found a divisor, so not prime
	        }
	    }
	    
	    return true;  // No divisors found, it's prime
	}

	// Calculate factorial
	public static int factorial(int num) {
	    int result = 1;
	    
	    for (int i = num; i > 0; i--) {
	        result *= i;  // Multiply result by each number
	    }
	    
	    return result;
	}

	// Find middle element of array
	public static int getMiddleElement(int[] arr) {
	    int middleIndex = arr.length / 2;
	    return arr[middleIndex];
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPrime(21));
		System.out.println(factorial(15));
		System.out.println(getMiddleElement(new int[]{10, 20, 30, 40, 50}));
		
	}

}
