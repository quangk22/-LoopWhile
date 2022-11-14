package baisic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 11.1
		// int i = 0;
		// int tong = 0;

		// while(i <= 100) {
		// tong += i;
		// i++;

		// }
		// System.out.println("Tổng từ 1 đến 100 là : "+ tong);

		// 11.2
//		System.out.println("Nhập số tự nhiên n ");
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while (i < n) {
//			if (i % 3 == 0) {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("Tổng của số chia hết cho 3 bé hơn n :" + sum);

		// 11.3

//		System.out.println("100 số đầu tiên của dãy Fibonacci :");
//		int fn = 0;
//		int f1 = 1;
//		int f2 = 1;
//
//		System.out.println(f1);
//		System.out.println(f2);
//		int i = 3;
//		while (i <= 100) {
//			fn = f1 + f2;
//			System.out.println(fn);
//		    f1 = f2;
//			f2 = fn;
//			i++;
//		}
		// 11.4
//		int n, j, reversed = 0;
//		System.out.println("nhập n : ");
//		n = sc.nextInt();
//		j = n;
//		while (n != 0) {
//			int digit = n % 10;
//			reversed = reversed * 10 + digit;
//			n /= 10;
//		}
//		System.out.printf("Số %d sau khi đảo ngược là: %d", j, reversed);
//		if(reversed == j) {
//			System.out.println("là số polinom");
//
//		}else {
//			System.out.println(" không phải số polinom");
//
//		}
//		11.5

		int a = 100;
		int b = 999;
		while (a <= b) {
			if (a % 3 == 0) {
				System.out.println(a + " ");

			}
			a++;

		}
	}

}
