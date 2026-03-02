/*A local variable total is assigned inside an if condition when items are available in stock.
The value of total is printed outside the condition block.*/

import java.util.Scanner;

public class Total {

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter the no of items");
int items=sc.nextInt();

String stock;

if(items<=10)
{

 stock ="The available stock is 10";
}

else{

stock ="the stock is unavailable";
}

System.out.println(stock);



}












}