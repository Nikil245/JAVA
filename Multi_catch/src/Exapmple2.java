public class Exapmple2 {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};

            System.out.println(arr[5]);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
