package ie.atu.sw;

public class MethodsExample {
	
	// Method with no parameters, no return
    public static void sayHello() {
        System.out.println("Hello!");
    }
    
    // Method with parameters
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }
    
    // Method with return value
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method with multiple parameters and return
    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    
    // Method that returns a boolean
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }


	public static void main(String[] args) {
		sayHello();
        greet("Alice");
        
        int result = add(5, 3);
        System.out.println("5 + 3 = " + result);
        
        double avg = calculateAverage(80, 90, 85);
        System.out.println("Average: " + avg);
        
        if (isEven(4)) {
            System.out.println("4 is even");
        }
        
        if (isOdd(5)) {
            System.out.println("5 is odd");
        }

	}

}
