package com.rashad.numberProgram;

import java.util.Scanner;

public class Strong {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number to find the number is strong or not:");
		int no = sc.nextInt();
		int fact = 1, last = 0, temp = no, sum = 0;
		while (no > 0) {
			last = no % 10;
			for (int i = 1; i <= last; i++) {
				fact *= i;
			}
			sum += fact;
			no /= 10;
			fact = 1;
		}

		if (temp == sum) {
			System.out.println("Strong number");
		} else {
			System.out.println("Not a strong number");
		}
	}

}
