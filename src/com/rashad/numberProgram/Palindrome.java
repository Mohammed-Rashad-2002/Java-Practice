package com.rashad.numberProgram;

import java.util.Scanner;

public class Palindrome {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the number to check the number is palindrome or not");
		int no=sc.nextInt();
		int temp=no;
		int rev=0;
		while (no>0) {
			int last=no%10;
			rev=rev*10+last;
			no/=10;
		}
		
		if(rev==temp) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}
}
