package com.rashad.numberProgram;

import java.util.Scanner;

public class Xylem {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Number to find xylem or pholem:");
		int no = sc.nextInt();
		int temp = no;
		int last = no % 10, sum = 0, total;
		no /= 10;
		while (no >= 9) {
			int last1 = no % 10;
			sum += last1;
			no /= 10;
		}
		total = last + no;
		if (total == sum) {
			System.out.println("Xylem");
		} else {
			System.out.println("Pholem");
		}
	}

}
