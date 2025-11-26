package ie.atu.sw;

import java.util.Scanner;

public class AgeChecker {
    
    public static void main(String[] args) {
        
        // Step 1 & 2: Create a Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Step 3: Ask the user
        System.out.println("Enter your age: ");
        
        // Step 4: Read what they typed
        int age = scanner.nextInt();
        
        // Step 5: Use the input
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
        
        // Step 6: Close the Scanner
        scanner.close();
    }
}
