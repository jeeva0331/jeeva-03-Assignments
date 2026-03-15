import java.util.Scanner;

class Payment {
    void processPayment() {
        System.out.println("Processing payment...");
    }
}

class CreditCardPayment extends Payment {
    void processPayment() {
              System.out.println("The amount is debited from your credit card");
  
    }
}

class DebitCardPayment extends Payment {
    void processPayment() {

        System.out.println("The amount is debited from your debit card");
    }
}

class UPIPayment extends Payment {
    void processPayment() {
      
           System.out.println("The amount is debited from your UPI Account");

    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Payment p;

        System.out.println("Choose Payment Method");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI");

        int choice = sc.nextInt();

        if(choice == 1) {
            p = new CreditCardPayment();
            System.out.println("enter the CreditCard number");
          int Ccard=sc.nextInt();
          System.out.println("enter your passcode");
          int code=sc.nextInt();

        }
        else if(choice == 2) {
            p = new DebitCardPayment();
            System.out.println("enter the DebitCard number");
          int Dcard=sc.nextInt();
          System.out.println("enter your passcode");
          int code=sc.nextInt();
        }
        else if(choice == 3) {
            p = new UPIPayment();
              System.out.println("enter the UPI ID");
          int id=sc.nextInt();
          System.out.println("enter your passcode");
          int code=sc.nextInt();
        }
        else {
            System.out.println("Invalid payment option");
            return;
        }

        p.processPayment();   // Runtime Polymorphism
    }
}
