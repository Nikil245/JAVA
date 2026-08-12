//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Error occurred");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error occurred");
        }
    }
}