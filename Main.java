package calculator3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		String back;

		String operations = "1- Addition\n" + "2- Subtraction\n" + "3- Multiplication\n" + "4- Division\n"
				+ "Q for Exit";

		System.out.println("Welcome to the Calculator!");
		System.out.println("-----");
		System.out.println(operations);
		System.out.println("Choose an operation code (1-4)");
		String code = scanner.nextLine();

		while (true) {

			switch (code) {
			case "1": {
				System.out.println("Enter the first integer.");
				a = scanner.nextInt();
				System.out.println("Enter the second integer.");
				b = scanner.nextInt();
				scanner.nextLine();
				System.out.println(a + b);
				System.out.println(operations);
				System.out.println("Choose an operation code (1-4)");
				code = scanner.nextLine();
				break;
			}
			case "2": {
				System.out.println("Enter the first integer.");
				a = scanner.nextInt();
				System.out.println("Enter the second integer.");
				b = scanner.nextInt();
				scanner.nextLine();
				System.out.println(a - b);
				System.out.println(operations);
				System.out.println("Choose an operation code (1-4)");
				code = scanner.nextLine();
				break;
			}
			case "3": {
				System.out.println("Enter the first integer.");
				a = scanner.nextInt();
				System.out.println("Enter the second integer.");
				b = scanner.nextInt();
				scanner.nextLine();
				System.out.println(a * b);
				System.out.println(operations);
				System.out.println("Choose an operation code (1-4)");
				code = scanner.nextLine();
				break;
			}
			case "4": {
				System.out.println("Enter the first integer.");
				a = scanner.nextInt();
				System.out.println("Enter the second integer.");
				b = scanner.nextInt();
				scanner.nextLine();
				System.out.println((double) a / b);
				System.out.println(operations);
				System.out.println("Choose an operation code (1-4)");
				code = scanner.nextLine();
				break;
			}
			case "Q": {
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + code);
			}
		}
	}
}
