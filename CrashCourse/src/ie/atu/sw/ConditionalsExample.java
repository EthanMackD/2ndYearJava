package ie.atu.sw;

public class ConditionalsExample {

	public static void main(String[] args) {

		// If-else statements
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
        
        // If-else if-else
        int grade = 75;
        if (grade >= 90) {
            System.out.println("Grade: A");
        } else if (grade >= 80) {
            System.out.println("Grade: B");
        } else if (grade >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
        // Switch statement - cleaner than multiple if-else for specific values
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of work week");
                break;  // Important! Without break, it continues to the next case
            case "Friday":
                System.out.println("Almost weekend");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Some other day");
        }
        
        // Switch with numbers
        int option = 2;
        switch (option) {
            case 1:
                System.out.println("You chose option 1");
                break;
            case 2:
                System.out.println("You chose option 2");
                break;
            default:
                System.out.println("Invalid option");
        }

	}

}
