/*.A login system assigns a local variable status only when username and password are correct.
After validation, the program prints login status outside the if block.
Check whether the program compiles safely in all cases.*/

import java.util.Scanner;

public class Loginsystem{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter the username: ");
String username=sc.nextLine();
System.out.println("enter the password: ");
String password=sc.nextLine();

String status;

if(username.equals("admin") ||  password.equals("1234"))
{

status="login succesfull";
}

else{
status="login failed. username or password is incorrect";
}

System.out.println(status);





}






}