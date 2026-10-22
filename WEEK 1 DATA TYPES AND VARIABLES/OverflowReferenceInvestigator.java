
 public class OverflowReferenceInvestigator {
    public static void main(String[] args) {
        // Byte overflow: 127 is the maximum value, so it wraps to -128.
        byte num = 127;
        num++;
        System.out.println("Byte overflow: " + num);

        String s1 = new String("warrap homie");
        String s2 = new String("warrap homie");
        String s3 = "warrap homie";

        System.out.println("s1 == s2: " + (s1 == s2));
        // False because new String creates separate objects.

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        // True because their text is the same.

        System.out.println("s1 == s3: " + (s1 == s3));
        // False because s1 is a new object and s3 uses a string literal.

        System.out.println("s1.equals(s3): " + s1.equals(s3));
        // True because both contain "warrap homie".

        System.out.println("s2 == s3: " + (s2 == s3));
        // False because s2 and s3 refer to different objects.

        System.out.println("s2.equals(s3): " + s2.equals(s3));
        // True because both contain "warrap homie".

        int[] a = {10, 20, 30};
        int[] b = a;

        b[0] = 99;

        System.out.println("Array a[0]: " + a[0]);
        System.out.println("Array b[0]: " + b[0]);
        // Both show 99 because a and b refer to the same array.
    }
}
