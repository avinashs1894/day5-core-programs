package com.remainder;

import java.util.Scanner;

public class remainder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dividend, divisor, Quo, Rem;
		System.out.print("Enter Dividend:");
		Scanner sc = new Scanner(System.in);
		dividend = sc.nextInt();

		System.out.print("Enter Divisor:");
		Scanner sc1 = new Scanner(System.in);
		divisor = sc.nextInt();

		Quo = dividend / divisor;

		Rem = dividend % divisor;

		System.out.println("Quotient: " + Quo);
		System.out.println("Remainder: " + Rem);
	}

}

