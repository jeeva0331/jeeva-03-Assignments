package Assignment;
import java.util.Scanner;

class InvalidUsernameException extends Exception{
	InvalidUsernameException(String msg){
		super(msg);
	}
	
	
}
class InvalidPasswordException extends Exception{
InvalidPasswordException(String msg){
	super(msg);
   }
}
class LoginSystem{
	static void login(String Correctusername,String Correctpassword, String username,String password ) 
			throws InvalidUsernameException,InvalidPasswordException {
		
		if(!username.equals(Correctusername)) {
			throw new InvalidUsernameException("invalid username");
		}
		else if(!password.equals(Correctpassword)) {
			throw new InvalidPasswordException("invalid password");
		}
		else {
		System.out.println("login successfull");
		}
		
	}
}

public class AssignmentE2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String Correctusername="admin";
		String Correctpassword="1234";
	
		
		int attempts=0;
		while(attempts<3) {
			
			System.out.println("enter the username: ");
			String username=sc.nextLine();
			
			System.out.println("enter the password: ");
			String password=sc.nextLine();
		try {
			LoginSystem.login(Correctusername,Correctpassword,username,password);
			break;
		}catch(InvalidUsernameException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidPasswordException e)
		{
			System.out.println(e.getMessage());
		
		}attempts++;
		
		
		if(attempts==3) {
			System.out.println("the login attempts was so many times failed. so program was terminated");
			
		}else {
			System.out.println("attempts left"+(3-attempts));
		}
	}
}
}
