package com.rashad.numberProgram;

import java.util.Scanner;

public class Factorials {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number to find the factorial:");
		int no = sc.nextInt();
		int fact = 1;

		for (int i = 1; i <= no; i++) {
			fact *= i;
		}

		System.out.println("factorial of a number is :" + fact);
	}

}
