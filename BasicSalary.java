
package com.index.pack;

import java.util.Scanner;

public class Employeeclass {
int empId;
String empName;
double basicSalary;
 
void calculate() {
	
	double HRA = basicSalary * 0.20;
	double DA =  basicSalary * 0.10;
	double bonus = 0;
	
	if(basicSalary>50000) {
	 bonus = basicSalary *0.05;
	 
	}
	double GrossSalary = basicSalary + HRA + DA + bonus;//
	System.out.println("empId " +empId);
	System.out.println("empName " + empName);
	System.out.println("empId " + GrossSalary);
	

}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Employeeclass e1=new Employeeclass();
	Employeeclass e2=new Employeeclass();
	Employeeclass e3=new Employeeclass();

	
	System.out.println("enter the employee 1 details");
	System.out.println("enter the empId :");
e1.empId=sc.nextInt();
System.out.println("enter the empname:");
e1.empName=sc.next();
System.out.println("enter the empBasicSalary :");
e1.basicSalary=sc.nextDouble();

System.out.println("Enter details for Employee 2");
System.out.print("Enter ID: ");
e2.empId = sc.nextInt();
System.out.print("Enter Name: ");
e2.empName = sc.next();
System.out.print("Enter Basic Salary: ");
e2.basicSalary = sc.nextDouble();

System.out.println("Enter details for Employee 3");
System.out.print("Enter ID: ");
e3.empId = sc.nextInt();
System.out.print("Enter Name: ");
e3.empName = sc.next();
System.out.print("Enter Basic Salary: ");
e3.basicSalary = sc.nextDouble();

System.out.println("Employee Salary Details");



e1.calculate();
e2.calculate();
e3.calculate();

sc.close();

}

}
