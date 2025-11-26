package ie.atu.sw;

public class LoopsExample {

	public static void main(String[] args) {

		// For loop
        System.out.println("For loop:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Iteration: " + i);
        }
        
        // While loop
        System.out.println("While loop:");
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;  // Don't forget this, or you'll have an infinite loop!
        }
        
        // Do-while loop - runs at least once
        System.out.println("Do-while loop:");
        int num = 0;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num < 3);
        
        // Break - exits the loop early
        System.out.println("Loop with break:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;  // Stops the loop when i reaches 5
            }
            System.out.println(i);
        }
        
        // Continue - skips to the next iteration
        System.out.println("Loop with continue:");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;  // Skips i=2
            }
            System.out.println(i);
        }
    }
}


