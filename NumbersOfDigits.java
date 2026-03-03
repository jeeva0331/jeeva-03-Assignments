/*Write a Java program to count the number of digits in a number.*/



package com.index.pack;

import java.util.Scanner;

public class NumberOfDigits {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value");
		int num=sc.nextInt();
		
	 if(num>=0 && num<=9) {
		 
			System.out.println("number of digits is 1");

	 }
	 else if(num>=10 && num<=99) {
		 
			System.out.println("number of digits is 2");
			

	 }
	 else if(num>=100 && num<=999) {
		 
			System.out.println("number of digits is 3");
		
	}
	 else if(num>=1000 && num<=9999) {
		 
			System.out.println("number of digits is 4");
		
	} else {
		 
			System.out.println("number of digits is more than 5");
		
	}

}
}
