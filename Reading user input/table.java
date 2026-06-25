// Ask for a number from the user for which he wants to print a table for. The message should be 
// “Please enter the number for which you want to print the table” . Store that number in a variable 
// n, create a method printTheTable, for calculating and printing the table for n. Use Scanner 
// method for accepting the input frm the user.

import java.util.Scanner;
public class table {

    public static int scanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number for which you want to print the table:");
        int n =sc.nextInt();
        return n;
    }

    public static void printTheTable(int n){
        System.out.println("The "+n+" Table upto 10 is :");
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
    }

    public static void main(String[] args) {
        int m= scanner();
        printTheTable(m);
    }
}