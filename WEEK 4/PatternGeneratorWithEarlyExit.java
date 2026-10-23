public class PatternGeneratorWithEarlyExit {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 4) {
                    break; // BREAK: Stops the inner loop when j reaches 4.
                }

                if (i == 3 && j == 2) {
                    continue; // CONTINUE: Skips printing column 2 in row 3.
                }

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}