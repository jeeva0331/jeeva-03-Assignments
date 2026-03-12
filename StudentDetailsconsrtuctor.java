import java.util.Scanner;
public class Student{
    int studentId;
    String studentname;
    int marks;
    
    Student(int i,String n,int m){
    studentId=i;
    studentname=n;
    marks=m;
    
    }
    
    void calculateGrade(){
        if(marks>=90){
            System.out.println("Grade A");
            
        }
        else if(marks>=75){
            System.out.println("Grade B");
            
        }
        else if(marks>=50){
            System.out.println("Grade C");
            
        }
        else{
            System.out.println("Fail");
            
        }}
        void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentname);
        System.out.println("Marks: " + marks);
        calculateGrade();
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st studentId ");
        int studentId1=sc.nextInt();
        sc.nextLine();
        
        System.out.println("enter the 1st Studentname");
        String studentname1=sc.nextLine();
        
        System.out.println("enter the marks");
         int mark1=sc.nextInt();

        Student s1=new Student(studentId1,studentname1,mark1);
        
        sc.nextLine();
        
           System.out.println("enter the 2nd studentId ");
        int studentId2=sc.nextInt();
        sc.nextLine();
        
        System.out.println("enter the 2nd Studentname");
        String studentname2=sc.nextLine();
        
        System.out.println("enter the marks");
         int mark2=sc.nextInt();
        
        Student s2=new Student(studentId2,studentname2,mark2);
        
      s1.display();
        s2.display();
    }
    
    
}
