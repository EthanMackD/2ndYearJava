package ie.atu.sw;

public class ExceptionHandlingExample {
	
	 // Method that declares it might throw an exception
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        
        // Try-catch: attempt something risky, handle if it fails
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // This will cause an error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
            System.out.println("Details: " + e.getMessage());
        }
        
        // Try-catch-finally: finally always runs
        try {
            String text = "123abc";
            int number = Integer.parseInt(text);  // Trying to convert to number
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } finally {
            System.out.println("This runs no matter what");
        }
        
        // Catching the exception we threw
        try {
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        
        // Multiple catch blocks
        try {
            int num = Integer.parseInt("abc");
            int[] arr = {1, 2, 3, 4, 5, 6};
            System.out.println(arr[5]);
        } catch (NumberFormatException e) {
            System.out.println("Number format problem");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index problem");
        } catch (Exception e) {
            System.out.println("Some other problem");
        }
    }
}
