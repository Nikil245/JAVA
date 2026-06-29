public class while_loop {

    public static void main(String[] args) {
        int count=1;
        while (count<=10) {
            System.out.println("2x"+count+":"+count*2);
            count++;
        }

        // while (true) {
        //     if(count==6){
        //         break;
        //     }
        //     System.out.println("the count is:"+count);
        //     count ++;
        // }

        do{
            System.out.println("The count:"+count);
            count++;
        }while(count<=6);
    }
}