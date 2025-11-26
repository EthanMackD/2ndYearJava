package ie.atu.sw;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

	public static void displayAllBooks(List<String> bookTitles, List<Boolean> isAvailable) {
		for (int i = 0; i < bookTitles.size(); i++) {
			String status = isAvailable.get(i) ? "Available" : "Borrowed";
	        System.out.println(bookTitles.get(i) + ": " + status);
		}
	}

	public static boolean borrowBook(List<String> bookTitles, List<Boolean> isAvailable, String searchedTitle) {
				
		// STEP 1: Find the book
	    // Use indexOf to search for the book title
	    // Store the result (position or -1 if not found)
	    int position = bookTitles.indexOf(searchedTitle);
	    
	    // STEP 2: Check if book was found
	    // If position is -1, it doesn't exist
	    if (position == -1) {
	        System.out.println("Book not found!");
	        return false;
	    }
	    
	    // STEP 3: Check if book is available
	    // Get the availability status at that position
	    if (isAvailable.get(position) == false) {
	        System.out.println("Book is already borrowed!");
	        return false;
	    }
	    
	    // STEP 4: Book is available, so borrow it
	    // Change availability to false at that position
	    isAvailable.set(position, false);
	    System.out.println("Book borrowed successfully!");
	    return true;
	
}

	public static boolean returnBook(List<String> bookTitles, List<Boolean> isAvailable, String bookBorrowed) {
		
		int position = bookTitles.indexOf(bookBorrowed);
		
		if (position == -1) {
	        System.out.println("Book not found!");
	        return true;
	    }
		
		if (isAvailable.get(position) == true) {
	        System.out.println("Book is ready to be returned");
	        return true;
	    }
		
		isAvailable.set(position, true);
	    System.out.println("Book returned successfully!");
	    return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<String> bookTitles = new ArrayList<>();
		List<Boolean> isAvailable = new ArrayList<>();

		bookTitles.add("The Hobbit");
		bookTitles.add("1984");
		bookTitles.add("To Kill a Mockingbird");

		isAvailable.add(true);
		isAvailable.add(true);
		isAvailable.add(false);
		
		
		
		boolean running = true;

		//set up the main menu for the choices
		
		while (running) {
			System.out.println("Welcome to the library! Choose an option below:");
			System.out.println("1: View Books");
			System.out.println("2: Borrow a book");
			System.out.println("3: Return a book");
			System.out.println("4: Exit");
			System.out.println("Enter choice: ");

			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				displayAllBooks(bookTitles, isAvailable);
				break;
			case 2:
				System.out.println("Choose which book you wish to borrow: ");
				sc.nextLine();
				String bookToBorrow = sc.nextLine();
			    borrowBook(bookTitles, isAvailable, bookToBorrow);
				break;
			case 3:
				System.out.println("Choose which book you wish to return: ");
				sc.nextLine();
				String bookToReturn = sc.nextLine();
			    returnBook(bookTitles, isAvailable, bookToReturn);
			case 4:
				running = false;
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}
		sc.close();
		}

	}


