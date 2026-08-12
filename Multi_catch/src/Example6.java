import java.util.Scanner;
import java.util.InputMismatchException;

public class Example6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter number: ");
            int number = sc.nextInt();

            int result = 100 / number;

            System.out.println(result);
        }

        catch (InputMismatchException | ArithmeticException e) {

            System.out.println("Invalid input or calculation!");
        }
    }
}
