package javastudy;

import java.util.Scanner;

public class If_Else_HW7 {
	public static boolean checkYear (int year) {
		return (year % 4 == 0 && year %100 !=0)||year %400 ==0;
	}
	public static void main (String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.println("Input month:");
		int month = input.nextInt();
		System.out.println("Input year:");
		int year = input.nextInt();
		if(month == 1 || month == 3 || month == 5 || month == 7 || month ==8 ||month == 10 || month == 12 ) {
			System.out.print("Month " + month + " has 31 days.");
		}else if (month == 4 || month == 6 || month == 9 || month == 11 ) {
			System.out.print("Month " + month + " has 30 days.");
		}else if (month == 2) {
			if (checkYear(year)) {
				System.out.print("Month " + month + " has 29 days.");
			}else {
				System.out.print("Month " + month + " has 28 days.");
			}
		}else {
			System.out.print("Invalid month.");
		}
			
		}
		
	}


