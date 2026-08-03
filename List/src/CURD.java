import java.util.ArrayList;
import java.util.List;

public class CURD {
    public static void main(String[] args){
        //Create
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Mango");
        list1.add("Jackfruit");
        list1.add("Watermelon");
        System.out.println("Create a list: "+list1);

        //Read
        System.out.println(list1.get(0));
        System.out.println(list1.contains("Mango"));
        System.out.println(list1.isEmpty());
        System.out.println(list1.indexOf("Banana"));
        System.out.println(list1.size());

        //Update
        System.out.println(list1.set(0,"GreenApple"));
        System.out.println(list1);

        //Delete
        System.out.println(list1.remove(0));
        System.out.println(list1);

        list1.clear();
        System.out.println(list1);

    }
}
