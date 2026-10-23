
public class ATMTransactionAuthorizer {
    public static void main(String[] args) {
        String username = "henry";
        String correctUsername = "henry";
        int pin = 1234;
        int correctPin = 1234;

        double balance = 12000;
        double withdrawal = 3000;
        double dailyWithdrawn = 0;
        double dailyLimit;
        double feeRate = 0;
        String tier = "";

        if (username.equals(correctUsername)) {
            if (pin >= 1000 && pin <= 9999 && pin == correctPin) {

                if (balance >= 50000) {
                    tier = "Platinum";
                } else if (balance >= 20000) {
                    tier = "Gold";
                } else if (balance >= 5000) {
                    tier = "Silver";
                } else {
                    tier = "Bronze";
                }

                switch (tier) {
                    case "Bronze":
                        dailyLimit = 5000;
                        feeRate = 0.02;
                        break;
                    case "Silver":
                        dailyLimit = 10000;
                        feeRate = 0.015;
                        break;
                    case "Gold":
                        dailyLimit = 20000;
                        feeRate = 0.01;
                        break;
                    default:
                        dailyLimit = 50000;
                        feeRate = 0.005;
                }

                System.out.println("Account Tier: " + tier);

                if (withdrawal > 0) {
                    if (withdrawal <= balance) {
                        if (dailyWithdrawn + withdrawal <= dailyLimit) {
                            double fee = withdrawal * feeRate;
                            double total = withdrawal + fee;

                            if (total <= balance) {
                                System.out.println("APPROVED");
                                System.out.println("Withdrawal: " + withdrawal);
                                System.out.println("Transaction Fee: " + fee);
                                System.out.println("Remaining Balance: "
                                        + (balance - total));
                            } else {
                                System.out.println("DENIED: Insufficient balance to cover withdrawal and transaction fee.");
                            }
                        } else {
                            System.out.println("DENIED: Daily withdrawal limit exceeded. Your limit is " + dailyLimit + ".");
                        }
                    } else {
                        System.out.println("DENIED: Insufficient balance for the requested withdrawal.");
                    }
                } else {
                    System.out.println("DENIED: Withdrawal amount must be greater than zero.");
                }

            } else {
                System.out.println("DENIED: Incorrect PIN or PIN must be 4 digits.");
            }
        } else {
            System.out.println("DENIED: Incorrect username.");
        }
    }
}