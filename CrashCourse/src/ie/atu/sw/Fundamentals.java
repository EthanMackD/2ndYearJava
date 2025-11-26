package ie.atu.sw;

public class Fundamentals {

	public static void main(String[] args) {

		// Basic data types
		
        int age = 25;                    // Whole numbers
        double salary = 45000.50;        // Decimal numbers
        boolean isEmployed = true;       // True or false
        String name = "Alice";           // Text
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Employed: " + isEmployed);
        
        // The 'var' keyword - Java figures out the type automatically
        
        var city = "Dublin";             // Java sees this is a String
        var population = 1228179;        // Java sees this is an int
        
        System.out.println(city + " has " + population + " people");
	}

}
