import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Runnable r = ()->{
            System.out.println("Hello");
        };

        List<String> array = new ArrayList();

        array.add("Hi");
        array.add("i");
        array.add("am");
        array.add("Java");

        array.forEach((n)-> System.out.println(n));
    }
}