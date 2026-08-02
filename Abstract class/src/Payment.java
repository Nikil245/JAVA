abstract public class Payment {
    abstract void processPyament(double amount);

    void printRecipt(double amount){
        System.out.println("Recipt $"+amount+" paid successfully");
    }
}
