package com.flipcoin;

import java.util.Scanner;

public class flipcoin {

	public static void main(String[] args) {
		int flip;
		System.out.println("Enter number of times to flip::");
		Scanner sc = new Scanner(System.in);
		flip = sc.nextInt();

		System.out.println("number of times are " +flip);
		int i=1;
		int head = 0;
		int tail = 0;
		while(i<=flip) {
			if(Math.random()<0.5) 
			{
				System.out.println("tail");
				tail=(tail+1);
			}
			else 
			{
				System.out.println("head");
				head=(head+1);
			}
			i++;
		}	

		double tailpercentage= (tail*100)/flip;
		double headpercentage= 100 - tailpercentage; 
		System.out.println("heads percentage is " + headpercentage);
		System.out.println("tails percentage is " + tailpercentage );

	}
}

