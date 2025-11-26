package test.java.com;

public class OverloadChallenge {
	
	//Call the method name and the arguments in the main method
	//conversions only happen in the methods themselves
	
	public static void main(String[] args) {
		
		System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + " cm");	
		//Calling second method
		System.out.println("68in = " + convertToCentimeters(68) + " cm");
		//Calling first method
		
		System.out.println(getDurationString(3945));
		//Calling first method
		System.out.println(getDurationString(65, 45));
		//Calling second method

		
	}
	
	public static double convertToCentimeters(int inchHeight) {
		
		return inchHeight * 2.54;
		
	}
	
	public static double convertToCentimeters(int feet, int inches) {
		
		return convertToCentimeters((feet * 12) + inches);

		// returns same value as below
		// return ((feet * 12) + inches) * 2.54;
					
	}
	
	public static String getDurationString(int seconds) {
		
		if (seconds < 0) {
			System.out.println("Invalid input.");
		}
		
		//2 step approach
		int minutes = seconds / 60;
		return getDurationString(minutes, seconds);
		
		
		//1 step approach
		//int hours1 = seconds / 3600;
		//System.out.println("Hours1 = " + hours1);		
	}
	
	public static String getDurationString(int minutes, int seconds) {
		
		if (minutes < 0) {
			System.out.println("Invalid input");
		}
		else if ((seconds < 0) || (seconds > 59)) {
			System.out.println("Invalid input");
		}
		
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		int remainingSeconds = seconds % 60;
		
		return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
			
	}
		
}



