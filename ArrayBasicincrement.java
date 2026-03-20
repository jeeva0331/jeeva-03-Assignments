public class Pattern {
    public static void main(String[] args) {

        int n = 4;
  int  num =1;

        for (int i = 1; i <= n; i++) {      // rows
            for (int j = 1; j <= i; j++) {  // numbers in each row
                System.out.print(num+" ");
            num++;
            }
            System.out.println();
        }
    }
}
