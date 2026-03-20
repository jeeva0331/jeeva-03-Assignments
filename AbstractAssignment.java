import java.util.Scanner;

abstract class Account{
    abstract void calculateInterest();
    
    void display(){
        System.out.println("Welcome to the bank");
    }
}
class SavingsAccount extends Account{
    void calculateInterest(){
        System.out.println("Your SavingsAccount is created successfully");
    }
}
class CurrentAccount extends Account{
    void calculateInterest(){
        System.out.println("Your CurrentAccount is created succesfully ");
        
    }
}
class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       Account a;
        System.out.println("Choose one");
        System.out.println("1.SavingsAccount");
        System.out.println("2. CurrentAccount");
        
        int choice=sc.nextInt();
        if(choice==1){
          a=new SavingsAccount();
            a.display();
            a.calculateInterest();
        }
          else if(choice==2){
         a=new CurrentAccount();
            a.display();
            a.calculateInterest();
          }
           else{
               System.out.println("invalid option.");
           }
    }
}
