package test.java.com;

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		int newScore = calculateScore("John", 500);
		System.out.println("New score is " + newScore);
		
		
		
		//Methods with same name but different parameters are able to be used.
		
		calculateScore(75); //Calling method 2 because of only 1 parameter.
		
		calculateScore("Mike", 100); // Calling method 1 because of 2 parameters.
		
		calculateScore(); // Calling method 3 because no parameters
		
	}
	
	public static int calculateScore(String playerName, int score) { // Method 1 (2 parameters)
		
		System.out.println("Player " + playerName + " scored " + score + " points.");
		return score * 1000;
		
	}
	
	public static int calculateScore(int score) { // Method 2 (1 parameter)
		
		System.out.println("Unnamed player scored " + score + " points.");
		return score * 1000;
	}
	
	
	public static int calculateScore() { // Method 3 (no parameters)
		
		System.out.println("No player name, no player score.");
		return 0;
	}

}
