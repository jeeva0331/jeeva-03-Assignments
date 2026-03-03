package com.index.pack;
import java.util.Scanner;


public class LargestThreeNumbers {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of A: ");
		int A=sc.nextInt();
		System.out.println("enter the value of B: ");
		int B=sc.nextInt();
		System.out.println("enter the value of C: ");
		int C=sc.nextInt();
		
		if(A>B && A>C)
		{
			System.out.println("A is largest value");
			System.out.println("The largest value is: " +A);

		}
				
else if(B>C && B>A) {
			
			System.out.println("B is largest value");
			System.out.println("The largest value is: " +B);

		}
		
else{
	
	System.out.println("C is largest value");
	System.out.println("The largest value is: " +C);

}		
	}

}
