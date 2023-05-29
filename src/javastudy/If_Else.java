package javastudy;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// -----------------------------HW1--------------------------

		System.out.println("HW1");
		System.out.println("Please input number:");
		int n = input.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " is an even number");

		} else {
			System.out.println(n + " is an odd number");
		}
		// -----------------------------HW2--------------------------
		System.out.println("HW2");
		System.out.println("Please input your values:");
		int a = input.nextInt();
		int b = input.nextInt();
		if (a >= b) {
			System.out.println(a + " is equal or bigger than " + b);
		} else {
			System.out.println(a + " is smaller than " + b);
		}

		// -----------------------------HW3--------------------------
		System.out.println("HW3");
		System.out.println("Please input your name:");
		String name1 = input.next();
		String name2 = input.next();
		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("They have same name");

		} else {
			System.out.println("They have different name");
		}

		// -----------------------------HW4--------------------------
		System.out.println("HW4");
		System.out.println("Please input three numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("The biggest number is: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The biggest number is: " + num2);
		} else {
			System.out.println("The biggest number is: " + num3);
		}
		// -----------------------------HW5--------------------------
		System.out.println("HW5");
		System.out.println("Please input your number:");
		int c = input.nextInt();
		if (10 <= c && c <= 100) {
			System.out.println(c + " belongs to [10,100] ");
		} else {
			System.out.println(c + " does not belong to [10,100] ");
		}
		// -----------------------------HW6--------------------------
		System.out.println("HW6");
		System.out.println("Please input a student grade:");
		int grade = input.nextInt();
		if (8.5 <= grade && grade <= 10) {
			System.out.println("Your grade is A.");

		} else if (7.5 <= grade && grade < 8.5) {
			System.out.println("Your grade is B.");
		} else if (5 <= grade && grade < 7.5) {
			System.out.println("Your grade is C.");
		} else {
			System.out.println("Your grade is D.");
		}

	}
}
