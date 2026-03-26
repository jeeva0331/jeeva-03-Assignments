public class Pattern {
    public static void main(String[] args) {
        int n = 9;

        // Top row
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Upper V
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Lower inverted V
        for (int i = n / 2 - 1; i >= 1; i--) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Bottom row
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }
}
