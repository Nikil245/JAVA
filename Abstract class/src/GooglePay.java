class GooglePay extends Payment{
    @Override
    void processPyament(double amount) {
        System.out.println("Recipt $"+amount+" paid successfully");
    }
}
