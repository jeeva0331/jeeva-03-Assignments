import java.util.Scanner;
public class AssignmentArray {
	

	
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int[] arr=new int[5];
	        
	        System.out.println("enter 5 number: ");
	        
	        for(int i=0;i<arr.length;i++){
	            arr[i]=sc.nextInt();
	        }
	        System.out.println("array elements are: ");
	        
	        for(int i=0;i<5;i++){
	            System.out.println(arr[i]);
	        }
	    
	sc.close();
	}
}
