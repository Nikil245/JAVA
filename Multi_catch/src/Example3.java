public class Example3 {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        }
        catch (ArithmeticException | NullPointerException e) {
            System.out.println("Exception handled");
        }
        finally {
            System.out.println("Finally executed");
        }
    }
}
