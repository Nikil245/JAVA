public class Example4 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        try {
            int x = 10 / 0;
        }
        catch (ArithmeticException | NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}