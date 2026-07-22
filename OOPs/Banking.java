class BankAccount{
    private String accountHolder;
    private double balance=0.0;

    BankAccount(String accHolder){
        accountHolder=accHolder;
        balance=0.0;
    }

    public void deposite(double amount){
        if(amount >0){
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        }
    }

    public void withdraw(double amount){
        if(amount<=balance){
            balance -=amount;
            System.out.println("₹" + amount + " withdrawed successfully.");
        }else{
            System.out.println("Insufficiant Balanace");
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }
}



public class Banking {

    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount("Ramu");
        System.out.println("AccountHolder name:"+customer1.getAccountHolder());
        customer1.deposite(20000);

        customer1.withdraw(15000);
        double money1=customer1.getBalance();
        System.out.println("Remaining money:"+money1);
        customer1.withdraw(10000);
        double money2=customer1.getBalance();
        System.out.println("Remaining money:"+money2);

    }
}