package javastudy;

import java.util.Scanner;

public class Java_Exercises {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
//		// -----------------HW1-----------------
//		System.out.println("HW1");
//		System.out.println("Input n:");
//		int n = input.nextInt();
//		int S1 = 0;
//		while (n < 0) {
//			System.out.println("Invalid data, pls retry");
//			n = input.nextInt();
//		}
//
//		for (int i = 1; i <= n; i++) {
//
//			S1 += i;
//		}
//		System.out.println("Sum:" + S1);
		
		
		// -----------------HW3-----------------
//		System.out.println("HW3");
//		System.out.println("Input n:");
//		float S3 = 0;
//		int n = input.nextInt();
//		for (int i=1;i<=n;i++) {
//			S3+= 1.0/(2*i);
//		}
//		System.out.println("Sum: " +S3);
//		
		
		// -----------------HW5-----------------
//		System.out.println("HW5");
//		System.out.println("Input n:");
//		int n = input.nextInt();
//		for (int i = 1; i <=n;i++) {
//			if(n%i ==0) {
//				System.out.println("Uoc so cua n: " +i);
//			}
//				
//		}
		// -----------------HW6-----------------
//		System.out.println("HW6");
//		System.out.println("Input a:");
//		int a = input.nextInt();
//		do {
//			System.out.println("Pls re-input value");
//			System.out.println("Input a:");
//			a = input.nextInt();
//		} while (a <= 0);
//
//		int count = 0;
//		// Tạo vòng lặp for kiểm tra giá trị nhập vào
//		for (int i = 1; i <= a; i++) {
//			// Nếu giá trị a chia hết cho i => cộng thêm 1 vào biến count để check tiếp
//			if (a % i == 0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			System.out.println(a + " la so nguyen to");
//		} else if (count == 1) {
//			System.out.println(a + " khong phai la so nguyen to");
//		} else {
//			System.out.println(a + " khong phai la so nguyen to");
//		}
//		
		// -----------------HW7-----------------
		System.out.println("HW7");
		System.out.println("Input a:");
		int a = input.nextInt();
		int sum =0;
		int du;
		do {
			du = a%10;
			if(du%2==0) {
				sum+=du;
			}
			a=a/10;
			
		}while (a>0);
		System.out.println("sum: " +sum);
			
			
		}
		
	}


