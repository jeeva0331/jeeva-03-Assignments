import java.util.Scanner;

interface Vehicle {
    void startEngine();
    void stopEngine();
}

class Car implements Vehicle {
    public void startEngine() {
        System.out.println("Car engine is Started.");
    }

    public void stopEngine() {
        System.out.println("Car engine is Stopped.");
    }
}

class Bike implements Vehicle {
    public void startEngine() {
        System.out.println("Bike engine is Started.");
    }

    public void stopEngine() {
        System.out.println("Bike engine is Stopped.");
    }
}

class Truck implements Vehicle {
    public void startEngine() {
        System.out.println("Truck engine is Started.");
    }

    public void stopEngine() {
        System.out.println("Truck engine is Stopped.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle v;

        System.out.println("Enter the choice:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");

        int choice = sc.nextInt();

        if (choice == 1) {
            v = new Car();
        } else if (choice == 2) {
            v = new Bike();
        } else if (choice == 3) {
            v = new Truck();
        } else {
            System.out.println("Invalid option");
            return;
        }

        v.startEngine();
        v.stopEngine();
    }
}
