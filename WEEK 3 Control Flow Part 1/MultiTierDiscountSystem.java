public class MultiTierDiscountSystem {
    public static void main(String[] args) {
        double purchaseAmount = 1300;
        double discount;
        String tier;

        if (purchaseAmount >= 3000) {
            discount = 0.15;
            tier = "15% Discount";
        } else if (purchaseAmount >= 2000) {
            discount = 0.10;
            tier = "10% Discount";
        } else if (purchaseAmount >= 1000) {
            discount = 0.05;
            tier = "5% Discount";
        } else {
            discount = 0.0;
            tier = "0% Discount";
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discount);

        System.out.println("Discount Tier: " + tier);
        System.out.println("Final Price: " + finalPrice);
    }
}