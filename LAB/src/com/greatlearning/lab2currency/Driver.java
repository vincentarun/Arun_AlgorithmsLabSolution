package com.greatlearning.lab2currency;

import java.lang.annotation.Target;
import java.util.Scanner;

import com.greatlearning.lab2paymoney.Transaction;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the currency denomination value");
		for(int i=0; i<size; i++)
			
		arr[i] = sc.nextInt();
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		Transaction transaction = new Transaction();
		while (amount-- != 0) {

		

}
	}
}
