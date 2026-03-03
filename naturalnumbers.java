package com.index.pack;
import java.util.Scanner;
public class SumOfFirstnNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int n=sc.nextInt();
		int sum;
		
		sum = n*(n+1)/2;
		System.out.println("Sum of First " +n+ "number is " +sum);
	}

}
