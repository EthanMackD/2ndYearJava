package test.java.com;

public class MethodPractice {

	public static void main(String[] args) {

		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Tim", highScorePosition);

		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("John", highScorePosition);

		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Bob", highScorePosition);

		highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("Mike", highScorePosition);

		highScorePosition = calculateHighScorePosition(25);
		displayHighScorePosition("Ned", highScorePosition);

	}

	public static void displayHighScorePosition(String playerName, int highScorePosition) {

		System.out.println(
				"" + playerName + " managed to get into position " + highScorePosition + " on the high score list");
	}

	public static int calculateHighScorePosition(int score) {

		int position = 4;

		if (score >= 1000) {
			position = 1;
		} else if (score >= 500) {
			position = 2;
		} else if (score >= 100) {
			position = 3;
		}

		return position;
	}

	// kmh to miles converter

	public static long toMilesPerHour(double kilometersPerHour) {

		if (kilometersPerHour < 0) {
			return -1;
		}
		return Math.round(kilometersPerHour / 1.609);
	}

	public static void printConversion(double kilometersPerHour) {

		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
			return;
		}
		long milesPerHour = toMilesPerHour(kilometersPerHour);
		System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
	}

//mb to kb converter

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {

		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
			return;
		}

		int mb = kiloBytes / 1024;
		int remainingKB = kiloBytes % 1024;
		System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainingKB + " KB");
	}

	public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {

		if ((hourOfTheDay < 0) || (hourOfTheDay > 23)) {
			return false;
		}

		if ((barking == true) && (hourOfTheDay < 8)) {
			return true;
		} else if ((barking == true) && (hourOfTheDay > 22)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isLeapYear(int year) {

		// if year is less than 1 or greater than 9_999, it's invalid,
		// so return false
		if (year < 1 || year > 9_999) {
			return false;
		}

		if (year % 4 == 0) { // if year is divisible by 4, go to next step.
			if (year % 100 != 0) { // if year is not divisible by 100, it's a leap year, so return true.
				return true;
			} else { // if year was divisible by 100, let's check if it's divisible by 400.
				if (year % 400 == 0) { // if it's divisible by 400, it's leap year.
					return true;
				} else { // otherwise, it's not a leap year, so return false.
					return false;
				}
			}
		} else { // year is not divisible by 4, so it's not a leap year.
			return false;
		}
	}

}
