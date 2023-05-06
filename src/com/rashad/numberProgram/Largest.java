package com.rashad.numberProgram;

import java.util.Scanner;

public class Largest {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// largest of two number
		
		System.out.println("Enter first number");
		int first=sc.nextInt();
		System.out.println("Enter Second number");
		int second=sc.nextInt();
		
		if(first>second) {
			System.out.println("Largest Number is: "+ first);
		}else {
			System.out.println("Largest number is :"+ second);
		}
		
		// largest of three number
		
		System.out.println("Enter first number");
		int first1=sc.nextInt();
		System.out.println("Enter Second number");
		int second2=sc.nextInt();
		System.out.println("Enter third number");
		int third3=sc.nextInt();
		
		if(first1>second2 && first1>third3) {
			System.out.println("Largest Number is: "+ first1);
		}else if(second2>third3) {
			System.out.println("Largest Number is: "+ second2);
		}else {
			System.out.println("Largest Number is: "+ third3);
		}
		
		// second largest
		
		System.out.println("Enter first number");
		int f1=sc.nextInt();
		System.out.println("Enter Second number");
		int s2=sc.nextInt();
		System.out.println("Enter third number");
		int t3=sc.nextInt();
		
		if(f1>s2 && f1>t3) {
			if(s2>t3) {
				System.out.println("Second largest number is:"+ s2);
			}else {
				System.out.println("Second largest number is:"+ t3);
			}
		}else if(s2>t3) {
			if(f1>t3) {
				System.out.println("Second largest number is:"+ f1);
			}else {
				System.out.println("Second largest number is:"+ t3);
			}
		}else {
			if(f1>s2) {
				System.out.println("Second largest number is:"+ f1);
			}else {
				System.out.println("Second largest number is:"+ s2);
			}
		}
		
	}

}
