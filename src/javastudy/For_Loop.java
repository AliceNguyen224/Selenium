package javastudy;

import java.util.Scanner;

public class For_Loop {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//---------HW1-------------
		System.out.println("Input your values:");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {

			System.out.print(i + " ");

		}
		
		//---------HW2-------------
		System.out.println("Input your values:");
		int a = input.nextInt();
		int b = input.nextInt();
		if (a<=b) {
			for(int i=a; i<=b; i++) {
				System.out.print(i+ " ");
			}
		}else
			//a>b
			for(int i=b; i<=a;i++) {
				System.out.print(i+ " ");
			}
	}
	
}
