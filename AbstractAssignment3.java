import java.util.Scanner;

abstract class Transport{
    abstract void bookticket();
    
    void display(){
        System.out.println("welcome to the journey");
    }
}
class Bus extends Transport{
    void bookticket(){
        System.out.println("your bus ticket is booked successfully");
    }
}
class Train extends Transport{
    void bookticket(){
        System.out.println("your train ticket is booked succesfully ");
        
    }
}
class multipleCatchException{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Transport t;
        System.out.println("Choose one");
        System.out.println("1.Bus");
        System.out.println("2.Train");
        
        int choice=sc.nextInt();
        if(choice==1){
          t=new Bus();
            t.display();
            t.bookticket();
        }
          else if(choice==2){
         t=new Train();
            t.display();
            t.bookticket();
          }
           else{
               System.out.println("invalid option.");
           }
    }
}
