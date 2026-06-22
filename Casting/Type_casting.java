public class Type_casting{
    public static void main(String[] args) {
        int number1=20;
        short number2=15; 
        byte number3=5;


        long longsum=1000*(number1+number2+number3);
        System.out.println("The long sum of"+number1+"+"+number2+"+"+number3+"is :"+longsum);
        
        short shortsum=(short)(1000*(number1+number2+number3));
        System.out.println("The short sum of"+number1+"+"+number2+"+"+number3+"is :"+shortsum);



    }
}