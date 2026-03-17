package com.index.pack;
import java.util.Scanner;
public class AssignmentArray {
	

	
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int[] arr=new int[5];
	        
	        int sum=0;
	        System.out.println("enter 5 number: ");
	        
	        for(int i=0;i<arr.length;i++){
	            arr[i]=sc.nextInt();
	            sum=sum+arr[i];
	        }int n=arr.length;
	        double average=sum/n;
	        System.out.println("average of array elements is: " +average);	        
	    
	sc.close();
	}
}
