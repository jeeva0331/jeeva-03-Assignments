package com.index.pack;
import java.util.Scanner;
public class AccountBalance {

    double accountBalance;// Instance Variable stores permanent customer data
    AccountBalance(double balance) {
        accountBalance = balance;
    }

    void withdraw() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Withdrawal Amount:");
        double withdrawAmount = sc.nextDouble();//Local Variable needed only during transaction execution)
        if (withdrawAmount <= accountBalance) {
            accountBalance = accountBalance - withdrawAmount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }

        System.out.println("Remaining Balance: " + accountBalance);
    }

    public static void main(String[] args) {

    	 AccountBalance customer1 = new  AccountBalance(10000);
        customer1.withdraw();
    }
}
