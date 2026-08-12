public class Example5 {
    public static void main(String[] args) {

        try {

            String input = "abc";

            int number = Integer.parseInt(input);

            int result = 100 / number;

            System.out.println(result);
        }

        catch (NumberFormatException | ArithmeticException e) {

            System.out.println("Invalid operation");
        }
    }
}
