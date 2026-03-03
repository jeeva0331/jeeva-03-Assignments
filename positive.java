package com.index.pack;

import java.util.Scanner;

public class positive {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value  ");
		int A=sc.nextInt();
		
		if(A>0) {
		
			System.out.println("the value is positive ");

		}
		else if(A<0) {
			System.out.println("the value is negative ");

		}
		else {
		System.out.println(" the value is zero ");
		
		}
	}
}
