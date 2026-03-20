import java.util.Scanner;

abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();

    void display() {
        System.out.println("Welcome to the home");
    }
}

class Fan extends Appliance {
    void turnOn() {
        System.out.println("Fan is ON");
    }

    void turnOff() {
        System.out.println("Fan is OFF");
    }


   
}

class WashingMachine extends Appliance {
    void turnOn() {
        System.out.println("Washing Machine is ON");
    }

    void turnOff() {
        System.out.println("Washing Machine is OFF");
    }

   
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Appliance a;

        System.out.println("Choose one");
        System.out.println("1. Fan");
        System.out.println("2. Washing Machine");

        int choice = sc.nextInt();

        if (choice == 1) {
            Fan f = new Fan();
            f.display();
            f.turnOn();
            f.turnOff();
        } else if (choice == 2) {
            WashingMachine w = new WashingMachine();
            w.display();
            w.turnOn();
            w.turnOff();
        } else {
            System.out.println("Invalid option");
        }
    }
}
