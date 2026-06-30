import java.util.Scanner;

public class First_and_last_digit_sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find out the sum of first and last digit sum:");
        int number=sc.nextInt();
        int answer = SumOfFirstAndLasrDigit(number);
        System.out.println("The Fisrt and last digit sum answer is :"+answer);
    }

    public static int SumOfFirstAndLasrDigit(int num){
        int first =0 ;
        int last = num % 10;
        if(num<=0){
            return -1;
        }
        num=num/10;

        while(num!=0){
            if(num /10 == 0){
                first = num;
            }
            num = num /10;
        }
        return first + last;
    }
}