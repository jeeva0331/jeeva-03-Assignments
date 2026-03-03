package com.index.pack;
import java.util.Scanner;
public class largestnumbers {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of A: ");
	int A=sc.nextInt();
	System.out.println("enter the value of B: ");
	int B=sc.nextInt();
	
	if (A>B) {
	
	System.out.println("A is lagrest value");
	
	}
	
	else if(A<B){
		
		System.out.println("B is lagrest value");
		}
	}
}
