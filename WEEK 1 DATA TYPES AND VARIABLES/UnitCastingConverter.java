public class UnitCastingConverter {
    public static void main(String[] args) {
        double centimeters = 175.5;

        int meters = (int) centimeters / 100;
        double remainingCm = centimeters - (meters * 100);

        System.out.println("Whole meters: " + meters);
        System.out.println("Remaining centimeters: " + remainingCm);

        int number = 10;
        double wideNumber = number;
        // No cast is needed because double can store an int value.

        double decimal = 15.75;
        int wholeNumber = (int) decimal;
        // The decimal part (.75) is lost when converting double to int.

        System.out.println("Widening: " + wideNumber);
        System.out.println("Narrowing: " + wholeNumber);
    }
}
    

