/*A program assigns grade based on marks using multiple if-else if conditions.
The grade is displayed after conditions execution.
Verify whether Java guarantees initialization of the local variable.*/

import java.util.Scanner;

public class Grade{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter the mark1");
int mark1=sc.nextInt();
System.out.println("enter the mark2");
int mark2=sc.nextInt();
System.out.println("enter the mark3");
int mark3=sc.nextInt();

int total=mark1+mark2+mark3;
System.out.println(total);

int average=total/3;
System.out.println("the average is:" + average);

if(average >=90){

System.out.println("The grade is 'A'");
}
else if(average >=75)
{

System.out.println("The grade is 'B'");

}

else if(average >=50){

System.out.println("The grade is 'C'");
}

else{

System.out.println("fail");
}


}


}