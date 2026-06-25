import java.util.Scanner;

public class user_info {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("The user name is:"+name+" and user age is :"+age);
    }
}