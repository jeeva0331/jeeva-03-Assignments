package com.index.pack;
import java.util.Scanner;
public class Student {

	
	int StudentId;
	String StudentName;
	public int Sub2;
	
	Student(String name,int Id){
		 	StudentName=name;
		 
			StudentId=Id;
	}
	 void CalculateTotal() {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter Sub1 Marks:");
		    int Sub1=sc.nextInt();
		    System.out.println("Enter Sub2 Marks:");
		    int Sub2=sc.nextInt();
		    System.out.println("Enter Sub3 Marks:");
		    int Sub3=sc.nextInt();
	
		
		int Totalmarks= Sub1+ Sub2+ Sub3;
		System.out.println("TotalMarks:"+Totalmarks);
		
	 }
	
	
	

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter StudentName:");
    String name=sc.nextLine();
    System.out.println("Enter StudentId:");
    int Id=sc.nextInt();
    System.out.println("Name:"+name);
    System.out.println("StudentId:"+Id);
    Student s1=new Student(name,Id);
    s1.CalculateTotal();
    
}}
