 import java.util.Scanner;
 public class Product{
     int productId;
     String productname;
     int price;
     int quantity;
     int totalprice;
     
     Product(int p, String n,int a,int i){
         productId=p;
         productname=n;
         price=a;
         quantity=i;
     }  
         void calculatetotalprice(){
             totalprice=price *quantity;
             System.out.println("totalprice =" +totalprice);
         
     }
     
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the 1 product Id");
         int productId1=sc.nextInt();
         System.out.println("enter the 1 productname");
         String productname1=sc.next();
         System.out.println("enter the 1 price");
         int price1=sc.nextInt();
          System.out.println("enter the 1 quantity");
         int quantity1=sc.nextInt();
         
Product p1=new Product(productId1,productname1,price1,quantity1);
p1.calculatetotalprice();

         System.out.println("enter the 2 product Id");
         int productId2=sc.nextInt();
         System.out.println("enter the 2 productname");
         String productname2=sc.next();
         System.out.println("enter the 2 price");
         int price2=sc.nextInt();
          System.out.println("enter the 2 quantity");
         int quantity2=sc.nextInt();
         
Product p2=new Product(productId2,productname2,price2,quantity2);
p2.calculatetotalprice();

     }
 }
