package com.greatlearning.lab2paymoney;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Pay Money");
		System.out.println("Enter the size of the transaction array");

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++)

			arr[i] = sc.nextInt();

		System.out.println("Enter the total number of targets that needs to be achieved");
		int targetNo = sc.nextInt();

		Transaction transaction = new Transaction();
		while (targetNo-- != 0) {

			int flag = 0;
			long target;

			System.out.println("Enter the value of target");
			target = sc.nextInt();
			int res = transaction.achievableTarget(target,arr);
			if(res>0) {
				
				System.out.println("Target achieved after "+res+ " transactions ");
 
		}else {
				System.out.println("The given target is not achievable");
			}
		}

	}
}
