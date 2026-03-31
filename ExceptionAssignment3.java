package Assignment;
import java.util.Scanner;

class NullStudentNameException extends Exception{
	
	NullStudentNameException(String msg){
		super(msg);
	}
}
class InvalidMarksException extends Exception
{
	  InvalidMarksException(String msg){
		super(msg);  
	  }
}

class StudentGrade{
	 static void grade(String name,int marks)throws NullStudentNameException ,InvalidMarksException{
		 if(name==null || name.trim().isEmpty()) {
		 throw new NullStudentNameException("please enter valid student name");
		 }
		 if(marks < 0 || marks >100) {
			 throw new InvalidMarksException("invalid mark");
			 
		 }
			
		 }
	 }

public class AssignmentE3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter student name :");
		String name=sc.nextLine();
		
		System.out.println("enter the the marks :");
		int marks=sc.nextInt();
		
		try {
			StudentGrade.grade(name,marks);
		}
		catch(NullStudentNameException e) {
			System.out.println(e.getMessage());	
			}
		
		catch(InvalidMarksException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("process completed");
		}
	}
}
















