import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Looping_through_a1_List {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Apple","Banana","Mango","WaterMelon"));
        for(int i = 0;i <
                fruits.size();i++){
            System.out.println("Fruits: "+fruits.get(i));
        }

        for(String fruit : fruits){
            System.out.println("Fruits: "+fruit);
        }

        Iterator<String> it = fruits.iterator();
        while(it.hasNext()){
            String fruit = it.next();
            if (fruit.equals("Banana")){
                it.remove();
            }
        }
        System.out.println("Fruits: "+fruits);

        fruits.forEach(fruit-> System.out.println("Fruits: "+fruit));

        fruits.stream().forEach(System.out::println);

    }
}
