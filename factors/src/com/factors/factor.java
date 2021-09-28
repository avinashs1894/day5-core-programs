package com.factors;

import java.util.Scanner;

public class factor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number ::");
		int number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		for (int i = 2; i < number; i++) {
			while (number % i == 0) {
				System.out.println(i + " ");
				number = number / i;
			}
		}
		if (number > 2) {
			System.out.println(number);
		}
	}
}
