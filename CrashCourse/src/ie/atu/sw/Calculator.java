package ie.atu.sw;

import java.util.Scanner;

public class Calculator {

	public static int addition(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtraction(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	public static int division(int num1, int num2) {
		if (num2 == 0) {
			throw new ArithmeticException("Can't divide by zero!");
		}
		return num1 / num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter the operator of choice: ");
		String operator = sc.next();

		System.out.println("Enter your second number: ");
		int num2 = sc.nextInt();

		try {
			int result = 0;
			switch (operator) {
			case "+":
				result = addition(num1, num2);
				break;
			case "-":
				result = subtraction(num1, num2);
				break;
			case "*":
				result = multiplication(num1, num2);
				break;
			case "/":
				result = division(num1, num2);
				break;
			default:
				System.out.println("Invalid operator!");
				return;
			}

			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

}
