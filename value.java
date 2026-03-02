package com.index.pack;

import java.util.Scanner;

public class Asignment {
	public static int value(int num) {
     	
 		if(num>=0){
 		
 		System.out.println("the value is positive");
 		
 	return num;
 	}
 	
return 0;
 	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
    	
    	int result=value(num);
    	System.out.println("the result is " +result);
    	
	}
     	
	
}
	
	
