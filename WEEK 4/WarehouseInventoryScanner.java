
import java.util.Scanner;

public class WarehouseInventoryScanner {
    static Scanner s = new Scanner(System.in);
    static int[][] warehouse = {
        {10, 5, -1},
        {2, 8, 1},
        {7, -1, 4}
    };

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\nWAREHOUSE MENU");
            System.out.println("1. Show Inventory");
            System.out.println("2. Total Inventory");
            System.out.println("3. Find Low Shelf");
            System.out.println("4. Restock Shelf");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    for (int[] row : warehouse) {
                        for (int item : row) {
                            System.out.print(item + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    int total = 0;
                    for (int[] row : warehouse) {
                        for (int item : row) {
                            if (item == -1) {
                                continue; // Skip damaged shelves
                            }
                            total += item;
                        }
                    }
                    System.out.println("Total inventory: " + total);
                    break;

                case 3:
                    boolean found = false;
                    for (int i = 0; i < warehouse.length; i++) {
                        for (int j = 0; j < warehouse[i].length; j++) {
                            if (warehouse[i][j] != -1 &&
                                warehouse[i][j] <= 2) {
                                System.out.println("Low shelf found at row "
                                    + (i + 1) + ", column " + (j + 1));
                                found = true;
                                break; // Stop inner loop at first low shelf
                            }
                        }
                        if (found) {
                            break; // Stop outer loop too
                        }
                    }
                    if (!found) {
                        System.out.println("No critically low shelf found.");
                    }
                    break;

                case 4:
                    restock();
                    break;

                case 5:
                    System.out.println("Exiting warehouse system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        s.close();
    }

    static void restock() {
        System.out.print("Enter row (1-3): ");
        int r = s.nextInt();
        System.out.print("Enter column (1-3): ");
        int c = s.nextInt();

        while (r < 1 || r > 3 || c < 1 || c > 3 ||
               warehouse[r - 1][c - 1] == -1) {
            System.out.println("Invalid shelf or damaged shelf.");
            System.out.print("Enter row (1-3): ");
            r = s.nextInt();
            System.out.print("Enter column (1-3): ");
            c = s.nextInt();
        }

        System.out.print("Enter quantity to add: ");
        int qty = s.nextInt();

        while (qty <= 0) {
            System.out.print("Quantity must be positive. Enter again: ");
            qty = s.nextInt();
        }

        warehouse[r - 1][c - 1] += qty;
        System.out.println("Shelf restocked successfully!");
        return; // Return after restocking
    }
}
