/*An e-commerce application calculates discount only when order amount exceeds ₹5000.
The discount value is printed after the condition block.*/

import java.util.Scanner;

public class Ecommerce{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter the purchased amount");
int order=sc.nextInt();

if(order>=5000){

System.out.println("you purchased $5000 above so you have 10% discount");
}
else{
System.out.println("you puschased below $5000 So you don't have discount");
}

System.out.println("the discount value is:" + order/10);

}



}
