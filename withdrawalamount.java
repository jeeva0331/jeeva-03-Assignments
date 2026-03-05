package com.index.pack;

import java.util.Scanner;
public class Atm {
	public static void main(String [] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the withdrawal amount");
		int amount=sc.nextInt();
		
		int balance=10000;
		if(amount>balance) {
			System.out.println("insufficient balance");
			
		}
		else if(amount<=0) {
			System.out.println("invalid amount");

		}
		else {
			System.out.println("deduct money from your account");
			System.out.println("Remaining balance is "+(balance-amount));


		}
		
	}

}
