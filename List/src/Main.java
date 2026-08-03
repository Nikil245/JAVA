import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        List<String> list2 = new ArrayList<>(20);
        list2.add("Elephant");
        list2.add("Lion");
        list2.add("Tiger");

        System.out.println(list2);

        List<String> list3 = Arrays.asList("A","b","c");
        System.out.println(list3);
//        list3.add("ni");
//        System.out.println(list3);

        List<String> list4 = List.of("A1","B1","C3");
        System.out.println(list4);

//        list4.add("s");
//        System.out.println(list4);

        List<String> list5 = new ArrayList<>(List.of("A","B"));
        list5.add("k");
        System.out.println(list5);
    }
}