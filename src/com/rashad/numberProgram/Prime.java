package com.rashad.numberProgram;

import java.util.Scanner;

public class Prime {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number to check the num is prime or not");
		int no=sc.nextInt();
		if (no%2==0) {
			System.out.println(no+" Is a prime number");
		}else {
			System.out.println(no+ " not a prime number");
		}
	}

}
