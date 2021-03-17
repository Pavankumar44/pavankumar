package com.ticket.book;

import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int output = sumOfPrime(n);
		System.out.println(output);
		
	}
	
	public static int sumOfPrime(int n) {
		int sum=0;
		int i, count;
		for (int j = 1; j < n; j++) {
			count = 0;
			for (i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				sum += j;
			}
				
		}
		
		if(sum % n==0) {
			return 1;
		} else {
			return 0;
		}
		
	}
}