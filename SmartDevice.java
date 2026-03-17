import java.util.Scanner;

interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Fan implements SmartDevice {
    public void turnOn() {
        System.out.println("fan is turned on");
    }

    public void turnOff() {
        System.out.println("fan is turned Off.");
    }
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("light is turned on");
    }

    public void turnOff() {
        System.out.println("light is turned off");
    }
}

class AirConditioner implements SmartDevice {
    public void turnOn() {
        System.out.println("ac is turned on.");
    }

    public void turnOff() {
        System.out.println("ac is turned off.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      SmartDevice s;

        System.out.println("Enter the choice:");
        System.out.println("1. fan");
        System.out.println("2. light");
        System.out.println("3. ac");

        int choice = sc.nextInt();

        if (choice == 1) {
            s = new Fan();
        } else if (choice == 2) {
            s = new Light();
        } else if (choice == 3) {
            s = new AirConditioner();
        } else {
            System.out.println("Invalid option");
            return;
        }

        s.turnOn();
        s.turnOff();
    }
}
