package test.java.com;

public class CodeChallenge1 {
	
	
	public static double area(double radius) {
		
		if (radius < 0) {
			return -1.0;
		}
		else if (radius > 0) {
		    return radius * radius * Math.PI;
		}
		
		return radius;
		
	}

	public static double area(double x, double y) {
	    
	    double radius = x * y;
		
		if ((x < 0) || (y < 0)) {
			return -1.0;
		}
		else {
		    return radius;
		}
		
		
	}
	
        
	private static final int MIN_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final int DAYS_PER_YEAR = 365;
    private static final int MIN_PER_DAY = HOURS_PER_DAY * MIN_PER_HOUR;
    private static final int MIN_PER_YEAR = MIN_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;
 
    public static void printYearsAndDays(long minutes) {
        
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / MIN_PER_YEAR;
        long days = (minutes / MIN_PER_DAY) % DAYS_PER_YEAR;
        System.out.println(minutes + " min = " + years  + " y and " + days + " d");
    }
    
    
    public static void printEqual(int x, int y, int z) {
    	
    	if ((x < 0) || (y < 0) || (z < 0)) {
    		System.out.println("Invalid Value");
    	}
    	
    	else if ((x == y) && (x == z) && (y == x) && (y == z) && (z == x) && (z == y)) {
    		System.out.println("All numbers are equal");
    	}
    	else if ((x != y) && (x != z) && (y != x) && (y != z) && (z != x) && (z != y)) {
    		System.out.println("All numbers are different");
    	}
    	else {
    		System.out.println("Neither all are equal or different");
    	}
    	
    }
    
    
    


}

