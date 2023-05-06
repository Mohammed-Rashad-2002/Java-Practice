package com.rashad.numberProgram;

import java.util.Scanner;

public class FibonacciSeries {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the number to generate fibonacci series");
		System.out.print("Enter start number");
		int start=sc.nextInt();
		
		int second=start+1;
		System.out.print(start+" "+second+" ");
		for (int i = 3; i <=10; i++) {
			int third=start+second;
			System.out.print(third+" ");
			start=second;
			second=third;
			
		}
		
	}

}
