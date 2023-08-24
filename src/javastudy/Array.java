package javastudy;

import java.util.Scanner;

public class Array {
	static Scanner input = new Scanner(System.in);
	static int index = 0;
	public static void main(String[] args) {

		// --------------HW1---------------
		System.out.println("HW1");
		System.out.println("Nhap tong so phan tu cua mang: ");
		int n =input.nextInt();
		int arr[] = new int[100];
		NhapMang(n, arr);
		DanhSachDayPhanTu(n, arr);
		int maxNumber = TimSoLonNhat(n, arr);
		System.out.println("\nMax number: " + maxNumber);
		int evenNumber = TimSochan(n, arr);
		System.out.println("\nSo chan: " +evenNumber);
		int sum = TongSoLe(n, arr);
		System.out.println("\nTong cac so le: " +sum);
		System.out.println();
		int ListNumber[] = DanhSachCacSoLonHon0VaNhoHon10(n, arr);
		DanhSachDayPhanTu(index, ListNumber);

		// --------------HW2-------------
//		System.out.println("HW2");
//		System.out.println("Nhap tong so phan tu cua mang: ");
//		int n =input.nextInt();
//		int arr[]= new int[n];
//		NhapMang(arr);
//		DanhSachDayPhanTu(arr);
//		}
//		System.out.println("\nTong cua phan tu dau tien va cuoi cung: " + (arr[0] + arr[n-1]));

//		// --------------HW3-------------
//		System.out.println("HW3");
//		System.out.println("Nhap so phan tu mang: ");
//		int n = input.nextInt();
//		int arr[] = new int[n];
//		NhapMang(arr);
//		DanhSachDayPhanTu(arr);
//		System.out.println("\nSo chan: ");
//		for (int i = 0; i < n; i++) {
//			if (arr[i] % 2 == 0) {
//				System.out.print(arr[i] + " ");
//			}
//		}

//		// --------------HW4-------------
		
//		System.out.println("HW4");
//		System.out.println("Nhap so phan tu mang: ");
//		int n = input.nextInt();
//		int arr[] = new int[n];
//		int sum = 0;
//		NhapMang(arr);
//		DanhSachDayPhanTu(arr);
//		System.out.print("\nSo le: ");
//		for (int i = 0; i < n; i++) {
//			if (arr[i] % 2 == 1 && arr[i] > 0) {
//				System.out.print(arr[i] + " ");
//				sum += arr[i];
//			}
//		}
//		System.out.println("\nTong cua cac so le lon hon 0: " + sum);

//		// --------------HW5-------------
//		System.out.println("Nhap so phan tu mang: ");
//		int n = input.nextInt();
//		int arr[]= new int [n];
//		NhapMang(arr);
//		System.out.println("Danh sach so lon hon 0 va nho hon 10: ");
//		for (int i =0; i<n; i++) {
//			if (arr[i]>=0 && arr[i]<=10) {
//				System.out.print(arr[i]+ " ");
//			}
//		}
//		
//		// --------------HW6-------------
//		System.out.println("Nhap so phan tu mang: ");
//		int n = input.nextInt();
//		int arr[] = new int[n];
//		int sum = 0;
//		int average = 0;
//		NhapMang(arr);
//		DanhSachDayPhanTu(arr);
//		for (int i = 0; i < n; i++) {
//			sum += arr[i];
//			average += (sum / n);
//		}
//		System.out.println("\nTong cac phan tu trong mang: " + sum);
//		System.out.println("Trung binh cong cac phan tu trong mang: " + average);
//		
//		
}

public static void NhapMang(int n, int arr[]) {
	for (int i = 0; i < n; i++) {
		System.out.println("Nhap gia tri arr[" + i + "]");
		arr[i] = input.nextInt();
	}
}

public static void DanhSachDayPhanTu(int n, int arr[]) {
	System.out.println("Danh sach day phan tu: ");
	for (int i = 0; i < n; i++) {
		System.out.print(arr[i] + " ");
	}
}

public static int TimSoLonNhat(int n, int arr[]) {
	int maxNumber = arr[0];
	for (int i = 0; i < n; i++) {
		if (arr[i] > maxNumber) {
			maxNumber = arr[i];
		}
	}
	return maxNumber;
}

public static int TimSochan(int n, int arr[]) {
	for (int i = 0; i < n; i++) {
		if (arr[i] % 2 == 0) {
			return arr[i];
		}
	}
	return -1;
}

public static int TongSoLe(int n, int arr[]) {
	int sum = 0;
	for (int i = 0; i < n; i++) {
		if (arr[i] % 2 == 1 && arr[i] > 0) {
			sum += arr[i];
		}
	}
	return sum;
}

public static int[] DanhSachCacSoLonHon0VaNhoHon10(int n, int arr[]) {
	int ListNumber[] = new int[100];
	for (int i = 0; i < n ; i++) {
		if(arr[i] > 0 && arr[i] <10) {
			ListNumber[index]=arr[i];
			index++;
		}
	}
	return ListNumber;
}
 
}
