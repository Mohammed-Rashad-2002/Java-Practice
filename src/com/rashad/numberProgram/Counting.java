package com.rashad.numberProgram;

import java.util.Scanner;

public class Counting {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		int no=sc.nextInt();
		int temp=no,last=0,count=0;
		
		while(temp>0) {
			last=temp%10;
			temp/=10;
			count++;
		}
		System.out.println(no+ " count is : "+ count);
	}
}
