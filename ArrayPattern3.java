import java.util.Scanner;

public class PracticeArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++) {

            //  Print spaces
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            //  Print stars
            for(int j = 1; j <=i; j++) {
                System.out.print(i+" " );
                
            }

            System.out.println();
        }
    }
}
