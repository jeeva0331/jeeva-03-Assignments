public class ArrayPattern {
    public static void main(String[] args) {

        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 5; j++) {

                if (
                    (i == 1 && j >= 1 && j <= 5) ||   // Top row
                    (i >= 2 && i <= 5 && (j == 1 || j == 5)) || // Middle sides
                    (i == 6 && j >= 1 && j <= 5)     // Bottom row
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
