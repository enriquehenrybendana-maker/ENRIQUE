public class PrecedencePuzzleSolver {
    public static void main(String[] args) {
        int a = 5, b = 3, count = 2;

        // PREDICTED: true
        System.out.println(a + b > 7 && count == 2);

        // PREDICTED: 11
        System.out.println(a++ + b * 2);
        // The actual result is 11 because multiplication happens before addition.

        // PREDICTED: true
        System.out.println(++count > 2 || a < b);
    }
}