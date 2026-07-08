import java.util.Scanner;

class ShoppingList {

    public static String list(int item_code) {
        String item_name = "";

        switch (item_code) {
            case 1:
                item_name = "Fruits";
                break;

            case 2:
                item_name = "Vegetables";
                break;

            case 3:
                item_name = "Drinks";
                break;

            case 4:
                item_name = "Spices";
                break;

            case 5:
                item_name = "Oils";
                break;

            default: 
                System.out.println("Wrong item selected");
                return "";
        }

        System.out.println("Item name is " + item_name);
        return item_name;
    }
}

class ShoppingCart extends ShoppingList {

    public static double price(String item_name) {

        if (item_name.equals("Fruits")) {
            return 40.25;
        } else if (item_name.equals("Vegetables")) {
            return 62.25;
        } else if (item_name.equals("Drinks")) {
            return 45.26;
        } else if (item_name.equals("Spices")) {
            return 63.29;
        } else if (item_name.equals("Oils")) {
            return 75.50;
        }

        return 0.0;
    }
}

class Wallet extends ShoppingCart {

    double wallet_balance = 25.00;

    public void balance() {
        System.out.println("Current Wallet Balance : ₹" + wallet_balance);
    }

    public void recharge(double amount) {
        wallet_balance += amount;
        System.out.println("Recharge Successful!");
        System.out.println("New Balance : ₹" + wallet_balance);
    }

    public void updateBalance(double item_price) {
        wallet_balance -= item_price;
        System.out.println("Remaining Balance : ₹" + wallet_balance);
    }

    public void bill(double item_price) {

        if (item_price <= wallet_balance) {

            System.out.println("Purchase Successful!");
            updateBalance(item_price);

        } else {

            System.out.println("Low Balance!");

            double recharge_amt = item_price - wallet_balance;

            System.out.println("Minimum recharge required: ₹" + recharge_amt);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter recharge amount: ");
            double amount = sc.nextDouble();

            recharge(amount);

            if (wallet_balance >= item_price) {
                System.out.println("Purchase Successful!");
                updateBalance(item_price);
            } else {
                System.out.println("Still insufficient balance.");
            }
        }
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== Shopping Menu ==========");
        System.out.println("1. Fruits");
        System.out.println("2. Vegetables");
        System.out.println("3. Drinks");
        System.out.println("4. Spices");
        System.out.println("5. Oils");

        System.out.print("Enter Item Code: ");
        int item_code = sc.nextInt();

        Wallet obj = new Wallet();

        obj.balance();

        String item_name = obj.list(item_code);

        if (!item_name.equals("")) {

            double item_price = obj.price(item_name);

            System.out.println("Price : ₹" + item_price);

            obj.bill(item_price);
        }

        sc.close();
    }
}