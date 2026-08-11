import java.util.LinkedHashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("Apple",20);
        map.put("Mango",40);
        map.put("Banana",30);
        map.put("Greenapple",70);
        map.put("Watermelon",90);

        System.out.println(map);
        map.forEach((key,value)->{
            System.out.println(key+"-"+value);
        });

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        System.out.println(map.get("Apple"));
    }
}