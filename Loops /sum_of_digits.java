import java.util.Scanner;

public class sum_of_digits {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("The the number to find out the sum of the digits");
        int num = sc.nextInt();
        int sumdigit=SumOfDigits(num);
        System.out.println("The sum of "+num+" is:"+sumdigit);

    }

    public static int SumOfDigits(int num){
        int sum=0;
        int digit;
        while (num!=0) {
            digit=num%10;
            sum+=digit;
            num /=10;
        }
        return sum;
    }
}