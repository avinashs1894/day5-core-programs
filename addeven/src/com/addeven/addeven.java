package com.addeven;

import java.util.Scanner;

public class addeven {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num % 2 == 0)
			System.out.println("The entered number is even");
		else
			System.out.println("The entered number is odd");

	}
}
