package ie.atu.sw;

import java.util.*;

public class ErrorExercise {
	
	 public static int divide(int a) throws ArithmeticException {
	        if (a == 0) {
	            throw new ArithmeticException("Cannot divide by zero!");
	        }
	        return a / 100;
	    }

	 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int num = scanner.nextInt();
		
		 try {
	            int result = divide(num);
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Caught error: " + e.getMessage());
	        } finally {
	            System.out.println("Program completed");
	            scanner.close();
	        }
	    }
	}
