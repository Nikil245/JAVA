import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();

        student.put("Naveen",80);
        student.put("Sathis", 70);
        student.put("Krishna",75);
        student.put("Karthik",90);
        student.put("Kiran",95);
        student.put("Sujan",99);

        System.out.println(student);
        System.out.println(student.remove("Sujan"));
        System.out.println(student.get("Naveen"));
        System.out.println(student.containsKey("Kiran"));
        student.forEach((key,value)->{
            System.out.println(key+"="+value);
        });
    }
}