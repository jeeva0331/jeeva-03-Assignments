import java.util.Scanner;

// Step 1: Interface
interface Payment {
    void processPayment(double amount);
}

// Step 2: Implementing classes

class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via Credit Card");
    }
}

class UPIPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via UPI");
    }
}

class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via PayPal");
    }
}

// Step 3: Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment p;

        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. PayPal");

        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        // Step 4: Runtime Polymorphism
        if (choice == 1) {
            p = new CreditCardPayment();
        } else if (choice == 2) {
            p = new UPIPayment();
        } else if (choice == 3) {
            p = new PayPalPayment();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        // Step 5: Method call
        p.processPayment(amount);
    }
}
