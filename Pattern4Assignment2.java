public class VPattern {
    public static void main(String[] args) {
        int n = 9; // number of stars in top row

        // Row 1: Full row of stars
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Rows 2 onwards: V shape
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
