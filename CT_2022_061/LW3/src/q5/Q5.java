import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        int[] orderIDs = new int[1000];
        int[] orderCounts = new int[1000];

        int idIndex = 0;
        int countIndex = 0;

        do {
            boolean order = true;

            System.out.println("\nSelect a menu category:");
            System.out.println("1. Entree");
            System.out.println("2. Side dish");
            System.out.println("3. Drink");
            System.out.println("4. Exit");

            int selection = scanner.nextInt();

            switch (selection) {

                case 1:
                    System.out.println("\nEntree");
                    System.out.println("1. Tofu Burger     $3.49");
                    System.out.println("2. Cajun Chicken   $4.59");
                    System.out.println("3. Buffalo Wings   $3.99");
                    System.out.println("4. Rainbow Fillet  $2.99");
                    break;

                case 2:
                    System.out.println("\nSide dish");
                    System.out.println("5. Rice Cracker    $0.79");
                    System.out.println("6. No-Salt Fries   $0.69");
                    System.out.println("7. Zucchini        $1.09");
                    System.out.println("8. Brown Rice      $0.59");
                    break;

                case 3:
                    System.out.println("\nDrink");
                    System.out.println("9. Cafe Mocha      $1.99");
                    System.out.println("10. Cafe Latte     $1.90");
                    System.out.println("11. Espresso       $2.49");
                    System.out.println("12. Oolong Tea     $0.99");
                    break;

                case 4:
                    run = false;
                    order = false;
                    continue;

                default:
                    System.out.println("Invalid value");
                    continue;
            }

            while (order) {

                System.out.println("\nSelect an option:");
                System.out.println("1. Order a new item");
                System.out.println("2. Exit");

                int temp = scanner.nextInt();

                switch (temp) {

                    case 1:
                        System.out.print("Enter item ID: ");
                        orderIDs[idIndex] = scanner.nextInt();

                        System.out.print("Enter quantity: ");
                        orderCounts[countIndex] = scanner.nextInt();

                        idIndex++;
                        countIndex++;

                        break;

                    case 2:
                        order = false;
                        break;

                    default:
                        System.out.println("Invalid input");
                        break;
                }
            }

        } while (run);


        double total = 0;

        System.out.println("\n\n========== ORDER SUMMARY ==========");

        for (int i = 0; i < idIndex; i++) {

            int id = orderIDs[i];
            int qty = orderCounts[i];

            String itemName = "";
            double price = 0;

            switch (id) {

                case 1: itemName = "Tofu Burger"; price = 3.49; break;
                case 2: itemName = "Cajun Chicken"; price = 4.59; break;
                case 3: itemName = "Buffalo Wings"; price = 3.99; break;
                case 4: itemName = "Rainbow Fillet"; price = 2.99; break;
                case 5: itemName = "Rice Cracker"; price = 0.79; break;
                case 6: itemName = "No-Salt Fries"; price = 0.69; break;
                case 7: itemName = "Zucchini"; price = 1.09; break;
                case 8: itemName = "Brown Rice"; price = 0.59; break;
                case 9: itemName = "Cafe Mocha"; price = 1.99; break;
                case 10: itemName = "Cafe Latte"; price = 1.90; break;
                case 11: itemName = "Espresso"; price = 2.49; break;
                case 12: itemName = "Oolong Tea"; price = 0.99; break;

                default:
                    itemName = "Invalid Item";
                    price = 0;
                    break;
            }

            double subtotal = price * qty;
            total += subtotal;

            System.out.println(
                    itemName +
                            " | Unit Price: $" + price +
                            " | Quantity: " + qty +
                            " | Subtotal: $" + subtotal
            );
        }

        System.out.println("-----------------------------------");
        System.out.println("TOTAL AMOUNT: $" + total);
    }
}