package javastudy;

import java.util.Scanner;

public class Array_2 {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int array[] = new int[100];
		int n = 5;
		int pos =2;
		int value = 100;
		NhapMang(array, n );
		System.out.println("Mang gia tri: ");
		XuatMang(array, n);
		
		System.out.println("\nChen phan tu ");
		n = ChenPhanTu(array, n, pos, value);
		System.out.println("Mang sau khi da chen");
	    XuatMang(array, n);
		
	}
	
	public static void NhapMang (int array[], int n) {
		for  (int i=0; i< n ;  i++) {
			System.out.println ("Nhap gia tri a["+i+"]");
			array[i] = input.nextInt();
		}
		
	}
	
	public static void XuatMang (int array[], int n) {
		for (int i =0; i<n; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int ChenPhanTu (int array[], int n, int pos, int value) {
		for (int i =n; i>pos; i--) {
			array[i] = array[i-1];
			
		}
		array[pos]=value;
		n++;
		return n;
		
	}

}
