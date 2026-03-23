import java.util.Scanner;

class pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        
        for(int i=1;i<=num ;i++){
            for(int j=1;j<=num;j++){
                
                if(i==1 || i==num || j==1 ||j==num){
                    System.out.print("* ");
                }
                else if(i>=2 && i<=4 && (j<=(6-i)||j>=(5+i))){
                   System.out.print("* "); 
                }
                else if(i>=7 && i<=9 && (j<=(i-5)||j>=(16-i))){
                   System.out.print("* "); 
                   
            }
            else{
                System.out.print("  ");
            }
        }System.out.println();
        } 
    }
}
