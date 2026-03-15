import java.util.Scanner;

class Transport{
    void calculateFare(int members){
        System.out.println("Calculating fare...");
    }
}

class Bus extends Transport{
    void calculateFare(int members){
        int fare = 500;
        double total = members * (fare - fare*0.10);
        System.out.println("Bus Travel Fare: " + total);
        System.out.println("Enjoy travelling with Bus");
    }
}

class Train extends Transport{
    void calculateFare(int members){
        int fare = 400;
        double total = members * (fare - fare*0.10);
        System.out.println("Train Travel Fare: " + total);
        System.out.println("Enjoy travelling with Train");
    }
}

class Taxi extends Transport{
    void calculateFare(int members){
        int fare = 700;
        double total = members * (fare - fare*0.10);
        System.out.println("Taxi Travel Fare: " + total);
        System.out.println("Enjoy travelling with Taxi");
    }
}

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Transport t;

        System.out.println("Choose transport:");
        System.out.println("1. Bus");
        System.out.println("2. Train");
        System.out.println("3. Taxi");

        int choice = sc.nextInt();

        System.out.println("Enter number of members:");
        int members = sc.nextInt();

        if(choice == 1){
            t = new Bus();
        }
        else if(choice == 2){
            t = new Train();
        }
        else if(choice == 3){
            t = new Taxi();
        }
        else{
            System.out.println("Invalid option");
            return;
        }

        t.calculateFare(members); // Runtime Polymorphism
    }
}
