package javastudy;

import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		// -----------------------------HW1--------------------------

		Scanner input = new Scanner(System.in);
		System.out.println("HW1");
		int year = 15;
		System.out.println("Please input your name:");
		String name = input.next();
		System.out.println("Please input your age:");
		int age = input.nextInt();
		int ageFinal = age + year;
		System.out.println("After 15 years,age of " + name + "  will be " + ageFinal);

		// -----------------------------HW2--------------------------

		System.out.println("HW2");
		System.out.println("Please input your values:");
		int a = input.nextInt();
		int b = input.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping then a = " + a + ", b = " + b);

		// -----------------------------HW3--------------------------
		System.out.println("HW3");
		System.out.println("Please input your values:");
		int c = input.nextInt();
		int d = input.nextInt();
		if (c > d) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}

	}

}
