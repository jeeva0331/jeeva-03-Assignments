public class Pattern {
    public static void main(String[] args) {

        int n = 4;
    

        for (int i = n; i >=1; i--) {      // rows
            for (int j = 1; j <= i; j++) {  // numbers in each row
                System.out.print( j+" ");
            
            }
            System.out.println();
        }
    }
}
