import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static ShoppingCart shopCart = new ShoppingCart();

    public static void main(String[] args) {

        boolean exit = false;
        int userChoice;

        printInstructions();

        while (!exit) {

            System.out.println("\nEnter your choice:");
            userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {

                case 0:
                    printInstructions();
                    break;

                case 1:
                    shopCart.printList();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    modifyItem();
                    break;

                case 4:
                    removeItem();
                    break;

                case 5:
                    searchItem();
                    break;

                case 6:
                    exit = true;
                    System.out.println("Exiting shopping cart...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void printInstructions() {

        System.out.println("\nPress");
        System.out.println("0 - To print choices");
        System.out.println("1 - To print shopping List");
        System.out.println("2 - To add an item");
        System.out.println("3 - To modify an item");
        System.out.println("4 - To remove an item");
        System.out.println("5 - To search an item");
        System.out.println("6 - To exit the app");
    }

    public static void addItem() {

        System.out.print("Please enter the shopping item: ");
        shopCart.addItem(scanner.nextLine());
    }

    public static void modifyItem() {

        System.out.print("Enter the item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the replacement: ");
        String newItem = scanner.nextLine();

        shopCart.modifyCart(itemNo - 1, newItem);
    }

    public static void removeItem() {

        System.out.print("Enter the item number to remove: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();

        shopCart.removeItem(itemNo - 1);
    }

    public static void searchItem() {

        System.out.print("Insert item you want to search: ");
        String searchIT = scanner.nextLine();

        if (shopCart.searchItem(searchIT) != null) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }
    }
}