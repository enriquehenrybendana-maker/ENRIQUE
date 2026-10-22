public class TypeSafeShoppingCalculator {
    public static void main(String[] args) {
        int quantity = 3;
        double unitPrice = 49.99;
        String storeName = "citymart";

        double totalCost = quantity * unitPrice;

        System.out.println("Store: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);
        // totalCost should be double because the result can have decimal values.
    }
}