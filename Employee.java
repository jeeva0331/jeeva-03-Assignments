package com.index.pack;
import java.util.Scanner;

public class Employee {

    int employeeId;
    double basicSalary;

    Employee(int id, double salary) {
        employeeId = id;
        basicSalary = salary;
    }

    void calculateBonus() {

        double bonusAmount = basicSalary * 0.10;  

        double totalSalary = basicSalary + bonusAmount;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus Amount: " + bonusAmount);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();

        System.out.println("Enter Basic Salary:");
        double salary = sc.nextDouble();

        Employee emp1 = new Employee(id, salary);
        emp1.calculateBonus();
    }
}
