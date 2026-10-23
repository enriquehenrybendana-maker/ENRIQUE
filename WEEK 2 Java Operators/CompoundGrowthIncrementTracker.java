
public class CompoundGrowthIncrementTracker {
    public static void main(String[] args) {
        // Simulate balance growth over time
        double balance = 1000;

        balance += 500;
        System.out.println("After adding 500: " + balance);

        balance *= 1.10;
        System.out.println("After 10% growth: " + balance);

        balance += 200;
        System.out.println("After adding 200: " + balance);

        // Test post-increment (count++): print first, then increase
        int count = 5;
        System.out.println(count++);
        System.out.println(count);

        // Test pre-increment (++count): increase first, then print
        System.out.println(++count);
        System.out.println(count);

        // count++ prints the old value before increasing count.
        // ++count increases count first, so it prints the new value.
    }
}