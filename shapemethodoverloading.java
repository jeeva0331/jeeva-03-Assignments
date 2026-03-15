import java.util.Scanner;
class ShapeCalculator{
    void area(int side){
        System.out.println("area of square = " + side*side);
     }
     void area(int length,int width){
         System.out.println("area of rectangle ="+ length*width);
     }
     void area(double radius){
         System.out.println("area of circle =" + 3.14*radius*radius);
         
     }
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ShapeCalculator s=new ShapeCalculator();
        System.out.println("choose the shape to calculate");
       System.out.println("1.square");
       System.out.println("2.rectangle");
       System.out.println("3.circle");
       
       int choice = sc.nextInt();
       if(choice ==1){
         System.out.println("enter the square sides");
         int side=sc.nextInt();
          s.area(side);
            }
            else if(choice==2){
                System.out.println("Enter length :");
            int length = sc.nextInt();
         System.out.println("Enter width :");
             int width = sc.nextInt();
            s.area(length, width);
            }
            else if(choice==3){
              System.out.println("Enter radius:");
            double radius = sc.nextDouble();
            s.area(radius);
                  }
                  else{
                      System.out.println("invalid option");
                      return;
                  }

    }
}
