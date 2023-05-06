package com.rashad.numberProgram;

import java.util.Scanner;

public class Armstrong {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number to check the number is armstrong number or not");
		int no=sc.nextInt();
		int count=0,sum=1,temp=no,last=0,total=0;
		
		while(no>0) {
			no/=10;
			count++;
		}
		no=temp;
		while (no>0) {
			last=no%10;
			for (int i = 1; i <=count; i++) {
				sum*=last;
			}
			total+=sum;
			no/=10;
			sum=1;
		}
		if (total==temp) {
			System.out.println(temp+" is a Armstrong Number");
		}else {
			System.out.println(temp+ " is Not a Armstrong number");
		}
	}

}
