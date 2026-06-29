import java.util.Scanner;

public class palindrome_number {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = sc.nextInt();
        int reversed_number=Palindrome(number);
        if(reversed_number==number){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }
    }
    
    public static int Palindrome(int number){
        int reverse = 0;
        int digit;
        while (number!=0) {
            digit = number%10;
            reverse= reverse *10 +digit;
            number /=10;
        }
        return reverse;
    }
}