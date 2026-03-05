package com.index.pack;

import java.util.Scanner;
public class ArmStrongnumber {
	
public  static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("enter the Number");
    int num = sc.nextInt();
	
	int original = num;
	int sum = 0;
	int digit;
	 while(num > 0) {
		digit = num % 10;
		sum = sum + (digit * digit * digit);
		num = num / 10;
	 }
	 if(sum == original) {
         System.out.println("Armstrong Number");
     } else {
         System.out.println("Not an Armstrong Number");
     }
}
}
