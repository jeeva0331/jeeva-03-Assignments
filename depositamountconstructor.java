import java.util.Scanner;

public class BankAccount{
    int accountnumber;
    String holdername;
    double balance;
    
    BankAccount (int a,String n,double b){
        accountnumber=a;
        holdername=n;
        balance=b;
    }
    
    void deposit(double amount){
     balance=balance + amount;
     System.out.println("updated balance ="+ balance);
     
    } void displaybalance(){
                System.out.println("accountnumber " +accountnumber);
               System.out.println("holdername = " +holdername);
                System.out.println("totalbalance = " +balance);
 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
             System.out.println("enter the accountnumber");
             int accountnumber=sc.nextInt();
             System.out.println("enter the holdername ");
             String holdername=sc.next();
             System.out.println("balance");
            double balance=sc.nextDouble();
            
            
            BankAccount a1=new BankAccount(accountnumber,holdername,balance);     
             System.out.println("Enter deposit amount:");
        double amount = sc.nextDouble();
            
            a1.deposit(amount);      
a1.displaybalance();


    }
}
