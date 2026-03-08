
import java.util.Scanner;
class BankAccount{

int accountnumber;
String accountholdername;
double balance;

void deposit(double amount){
System.out.println("enter the deposit amount");
balance = balance + amount;
}

void withdraw(double amount)
{

if(amount <= balance){
System.out.println("enter the withdraw amount: ");
balance = balance - amount;

}

else{
System.out.println("insufficicent balance.");
}

}

void displaybalance(){
System.out.println("current balance: " + balance);

}

public static void main(String[] args){

Scanner se=new Scanner(System.in);

BankAccount acc1=new BankAccount();
System.out.println("enter the accountnumber");
acc1.accountnumber=se.nextInt();

System.out.println("enter the accountholdername");
acc1.accountholdername=se.next();

System.out.println("enter the initial balance");
acc1.balance=se.nextInt();

System.out.println("enter the deposit amount");
double depositAmount = se.nextDouble();
acc1.deposit(depositAmount);

System.out.println("enter the withdraw amount");
double withdrawAmount = se.nextDouble();
acc1.withdraw(withdrawAmount);

acc1.displaybalance();



}



}
