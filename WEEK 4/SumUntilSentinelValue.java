
import java.util.Scanner;

public class SumUntilSentinelValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        int total = 0;

        System.out.print("Enter an integer (-1 to stop): ");
        num = s.nextInt();

        while (num != -1) {
            total += num;

            System.out.print("Enter an integer (-1 to stop): ");
            num = s.nextInt();
        }

        System.out.println("Final Total: " + total);
        s.close();
    }
}
