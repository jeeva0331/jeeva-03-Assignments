// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class Student {

    int rollno;
    String name;
    int mark1, mark2, mark3;
    int total;
    double average;

    void calculateTotal() {
        total = mark1 + mark2 + mark3;
    }

    void calculateAverage() {
        average = total / 3;
    }

    void grade() {

        if (average >= 80) {
            System.out.println("Grade: A");
        } 
        else if (average >= 60) {
            System.out.println("Grade: B");
        } 
        else if (average >= 40) {
            System.out.println("Grade: C");
        } 
        else {
            System.out.println("Fail");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        grade();
      
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student stu[] = new Student[5];   

        for (int i = 0; i < 5; i++) {

            stu[i] = new Student();

            System.out.println("Enter details for Student " + (i + 1));

            System.out.println("Enter Name:");
            stu[i].name = sc.next();

            System.out.println("Enter Roll Number:");
            stu[i].rollno = sc.nextInt();

            System.out.println("Enter Mark1:");
            stu[i].mark1 = sc.nextInt();

            System.out.println("Enter Mark2:");
            stu[i].mark2 = sc.nextInt();

            System.out.println("Enter Mark3:");
            stu[i].mark3 = sc.nextInt();

            stu[i].calculateTotal();
            stu[i].calculateAverage();
        }

        System.out.println("\nStudent Results");

        for (int i = 0; i < 5; i++) {
            stu[i].display();
        }
    }
}
