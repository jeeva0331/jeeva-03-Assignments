import java.util.Scanner;

abstract class Food{
    abstract void prepare();
    
    void display(){
        System.out.println("welcome to the hotel.");
    }
}
class Pizza extends Food{
    void prepare(){
        System.out.println("pizza is ready");
    }
}
class Burger extends Food{
    void prepare(){
        System.out.println("burger is ready ");
        
    }
}
class multipleCatchException{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Food f;
        System.out.println("Choose one");
        System.out.println("1. pizza");
        System.out.println("2. burger");
        
        int choice=sc.nextInt();
        if(choice==1){
         Pizza p=new Pizza();
            p.display();
            p.prepare();
        }
          else if(choice==2){
         Burger b=new Burger();
            b.display();
            b.prepare();
          }
           else{
               System.out.println("invalid option.");
           }
    }
}
