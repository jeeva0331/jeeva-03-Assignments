import java.util.Scanner;

public class Employee{
    int empId;
    String empName;
    int salary;
    
    
    Employee(int i, String n, int s){
      empId=i;
         empName=n;
         salary=s;
        
    }
void displayEmployee(){
    System.out.println("empId is: "+empId);
    System.out.println("empName is: "+empName);
    System.out.println("salary is: "+salary);
}
    
   public static void main(String[] args){
Scanner sc=new Scanner(System.in);

  Employee e1=new Employee(101,"jeeva",45000); 
  Employee e2=new Employee(102,"jothes",55000); 
  Employee e3=new Employee(103,"jeni",65000); 

    
 
       
       e1.displayEmployee();
              e2.displayEmployee();
       e3.displayEmployee();



   } 
    
}
