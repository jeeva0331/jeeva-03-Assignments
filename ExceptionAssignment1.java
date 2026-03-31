package Assignment;
import java.util.Scanner;


class InsufficientAmountException extends Exception{
	String message;
	
	InsufficientAmountException(String msg){
		message=msg;
	}
		public String getMessage() {
		return message;
		
		}
	}

class NegativeAmountException extends Exception{
	String message;
	
	NegativeAmountException(String msg){
		message=msg;
	}
	public String getMessage() {
		return message;
	}
}

class Bank{
	static void withdraw(int balance, int amount)throws InsufficientAmountException,NegativeAmountException{
		
		if(amount>balance) {
			throw new InsufficientAmountException("limited exceeded!");
			
		}else if(amount<0) {
			throw new NegativeAmountException("amount cant be negative!");
		}
		else {
			System.out.println("withdrawal sucessfull");
			
		}
	} }
	
	public class AssignmentE1{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the balance :");
			int balance=sc.nextInt();

			
			System.out.println("enter the amount :");
			int amount=sc.nextInt();
			
			try {
				Bank.withdraw(balance,amount);
			}catch(InsufficientAmountException e) {
				System.out.println(e.getMessage());
			}catch(NegativeAmountException e) {
				System.out.println(e.getMessage());
			}finally
			{
				System.out.println("transcation log: completed");
			}
		}
		
	}
