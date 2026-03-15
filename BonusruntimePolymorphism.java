import java.util.Scanner;

class Employee {
    void calculateBonus(int salary) {
        System.out.println("Calculating bonus...");
    }
}

class Manager extends Employee {
    void calculateBonus(int salary) {
        System.out.println("Manager gets 10% bonus");
        System.out.println("Bonus = " + salary * 0.10);
    }
}

class Developer extends Employee {
    void calculateBonus(int salary) {
        System.out.println("Developer gets 15% bonus");
        System.out.println("Bonus = " + salary * 0.15);
    }
}

class Intern extends Employee {
    void calculateBonus(int salary) {
        System.out.println("Intern gets 5% bonus");
        System.out.println("Bonus = " + salary * 0.05);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp;

        System.out.println("Choose Employee Type");
        System.out.println("1. Manager");
        System.out.println("2. Developer");
        System.out.println("3. Intern");

        int choice = sc.nextInt();

        System.out.println("Enter salary:");
        int salary = sc.nextInt();

        if(choice == 1){
            emp = new Manager();
        }
        else if(choice == 2){
            emp = new Developer();
        }
        else if(choice == 3){
            emp = new Intern();
        }
        else{
            System.out.println("Invalid choice");
            return;
        }

        emp.calculateBonus(salary); // Runtime Polymorphism
    }
}
