public class Bank_acc {

    public static void main(String[] args) {

        // Using full constructor
        GrocMarket myAccount = new GrocMarket(
                "Manish",
                "#1256",
                "98356",
                100,
                "USA"
        );

        System.out.println("Account Balance: " + myAccount.getAccBal());
        System.out.println("Phone Number: " + myAccount.getCustPhNo());

        // Using second constructor
        GrocMarket newAcc = new GrocMarket(
                "NewCust",
                "#121212",
                "1212121"
        );

        System.out.println("Customer Name: " + newAcc.getCustName());
        System.out.println("Account Balance: " + newAcc.getAccBal());

        // Shopping
        myAccount.shop(40);

        // Recharge
        myAccount.rechargeAcc(100);
    }
}

class GrocMarket {

    private String custName;
    private String custID;
    private String custPhNo;
    private double accBal;
    private String address;

    // Full Constructor
    public GrocMarket(String custName, String custID, String custPhNo,
                      double accBal, String address) {

        this.custName = custName;
        this.custID = custID;
        this.custPhNo = custPhNo;
        this.accBal = accBal;
        this.address = address;

        System.out.println("Constructor Called");
    }

    // Constructor Overloading
    public GrocMarket(String custName, String custID, String custPhNo) {
        this(custName, custID, custPhNo, 200, "Sydney");
    }

    // Getters and Setters
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustPhNo() {
        return custPhNo;
    }

    public void setCustPhNo(String custPhNo) {
        this.custPhNo = custPhNo;
    }

    public double getAccBal() {
        return accBal;
    }

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Shopping Method
    public void shop(double amount) {

        if (accBal >= amount) {
            accBal = accBal - amount;
            System.out.println("Thanks for Shopping.");
            System.out.println("Remaining Balance: " + accBal);
        } else {
            double lowAmount = amount - accBal;
            System.out.println("Insufficient Balance.");
            System.out.println("Please add: " + lowAmount);
        }
    }

    // Recharge Method
    public void rechargeAcc(double recharge) {
        accBal = accBal + recharge;
        System.out.println("Thanks for Recharging.");
        System.out.println("New Balance: " + accBal);
    }
}