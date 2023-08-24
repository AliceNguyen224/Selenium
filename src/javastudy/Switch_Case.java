package javastudy;

import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//-----------------HW1-----------------
		System.out.println("HW1");
		System.out.println("Input number:");
		int number = input.nextInt();
		switch (number) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
		default:
			System.out.println("Error");
			break;

		}
		
		//-----------------HW2-----------------
		System.out.println("HW2");
		System.out.println("Input a:");
		int a = input.nextInt();
		System.out.println("Input b:");
		int b = input.nextInt();
		System.out.println("Input (+, -, *, /, %): ");
		char calculation = input.next().charAt(0);

		switch (calculation) {
		case '+':
			System.out.println(a + "+" + b + "=" + (a + b));
			break;
		case '-':
			System.out.println(a + "-" + b + "=" + (a - b));
			break;
		case '*':
			System.out.println(a + "*" + b + "=" + (a * b));
			break;
		case '/':
			if (b == 0) {
				System.out.println("Invalid data, b must be different from 0");
			} else {
				System.out.println(a + "/" + b + "=" + (a / b));
			}
			break;
		default:
			System.out.println("Error");
		}
		
		//-----------------HW3-----------------
		System.out.println("HW3");
		System.out.println("Input month: ");
		int month = input.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("This month has 31 days");
			break;
		case 2:
			System.out.println("This month has 28 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("This month has 30 days");
			break;
		default:
			System.out.println("Error");
			break;
		}
		
	}
}
