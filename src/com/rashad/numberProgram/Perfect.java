package com.rashad.numberProgram;

import java.util.Scanner;

public class Perfect {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the number to find the number is perfect or not:");
		int no=sc.nextInt();
		int sum=0;
		
		for (int i = 1; i <no; i++) {
			if (no%i==0) {
				sum+=i;
			}
		}
		if(sum==no) {
			System.out.println(no+" is Perfect Number");
		}
		else {
			System.out.println(no+" is not a perfect Number");
		}
	}

}
