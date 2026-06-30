import java.util.Scanner;

public class OddDigitSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find out the sum of the odd number only:");
        int num= sc.nextInt();
        int odd=OddDigitSum(num);
        System.out.println("The Sum of the odddigit number:"+odd);
    }
    
    public static int OddDigitSum(int number){
        if(number <=0){
            return -1;
        }
       int  sum=0;

       while (number!=0) {
            if((number%10) %2 !=0){
                sum += number%10;
            }
            number = number / 10;
       }
       return sum;
    }
}