class GrocMarket {

    private String custName;
    private String custID;
    private String custPhNo;
    private double accBal;
    private String address;

    // Setter Methods

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public void setCustPhNo(String custPhNo) {
        this.custPhNo = custPhNo;
    }

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Shopping Method

    public void shop(double amount) {

        if (accBal >= amount) {

            accBal = accBal - amount;

            System.out.println("Shopping Successful!");
            System.out.println("Amount Spent : ₹" + amount);
            System.out.println("Remaining Balance : ₹" + accBal);

        } else {

            double lowAmount = amount - accBal;

            System.out.println("Insufficient Balance!");
            System.out.println("Please Recharge : ₹" + lowAmount);
        }
    }

    // Recharge Method

    public void rechargeAcc(double recharge) {

        accBal += recharge;

        System.out.println("\nRecharge Successful!");
        System.out.println("Current Balance : ₹" + accBal);
    }

    // Display Customer Details

    public void displayCustomer() {

        System.out.println("\nCustomer Details");
        System.out.println("-------------------------");
        System.out.println("Name      : " + custName);
        System.out.println("Customer ID : " + custID);
        System.out.println("Phone No. : " + custPhNo);
        System.out.println("Address   : " + address);
        System.out.println("Balance   : ₹" + accBal);
        System.out.println("-------------------------");
    }
}

public class bank {

    public static void main(String[] args) {

        GrocMarket myAccount = new GrocMarket();

        // Setting values using Setter Methods

        myAccount.setCustName("Manish");
        myAccount.setCustID("#12345");
        myAccount.setCustPhNo("9876543210");
        myAccount.setAddress("India");
        myAccount.setAccBal(500.52);

        // Display Customer Details
        myAccount.displayCustomer();

        // Shopping
        myAccount.shop(498.52);

        System.out.println();

        myAccount.shop(100);

        // Recharge
        myAccount.rechargeAcc(700);

        System.out.println();

        // Shopping Again
        myAccount.shop(670);
    }
}