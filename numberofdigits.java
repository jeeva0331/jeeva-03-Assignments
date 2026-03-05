package com.index.pack;

import java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int num=sc.nextInt();
		int count = 0;

		        while(num > 0) {
		            num = num / 10; 
		            count++;        
		        }

		        System.out.println("Number of digits = " + count);
		 
	sc.close();
	}
		
				
	
	
		
	
	
	
	
	
	
	




}


