package com.rashad.numberProgram;

import java.util.Scanner;

public class Factors {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number to find it's factors: ");
		int no=sc.nextInt();
		
		for (int i = 1; i <=no; i++) {
			if (no%i==0) {
				System.out.print(i+ " ");
			}
		}
		
	}

}
