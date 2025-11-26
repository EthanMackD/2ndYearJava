package ie.atu.sw;

public class LoopExercise {

	public static void main(String[] args) {

		int numbers = 20;

		for (int i = 1; i <= numbers; i++) {
			if ((i % 5 == 0) && (i % 3 == 0)) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}

	}
}
