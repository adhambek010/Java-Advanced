package com.java.leetCode;

import java.util.Scanner;

public class SumOfnNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int i = sc.nextInt();
		System.out.println(sumOfnNumbers(i, 0));
		sc.close();
		
	}
	private static int sumOfnNumbers(int number, int sum) {
		if(number < 1) {
			return sum;
		}else {
			return sumOfnNumbers(number - 1, sum + number);
		}
			
	}

}
