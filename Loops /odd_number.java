import java.util.Scanner;

public class odd_number {

    public static void main(String[] args) {
        int num;
        int maxvalue;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        System.out.println("Enter a Max value which should be less than num:");
        maxvalue=sc.nextInt();
        while (num<=maxvalue) {
            num++;
            if(!isodd(num)){
                continue;
            }
            System.out.println(num);
        }

    }

    public static Boolean isodd(int num){
        if(num%2==1){
            return true;
        }else{
            return false;
        }
    }
}