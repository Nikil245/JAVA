public class Main {
    public static void main(String[] args) {
        int a =10;
        int b=0;

        try {
            int divide = a/b;
            System.out.println(divide);
        }catch (ArithmeticException e){
            System.out.println("Cannot be divided by zero");
        }
        System.out.println("Program Ended");

        try {
            int[] arr = {10, 20, 30};

            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic problem");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        try {
            int x = 10 / 2;
            System.out.println(x);
        }
        catch (ArithmeticException e) {
            System.out.println("Error");
        }
        finally {
            System.out.println("Finally executed");
        }
    }

}