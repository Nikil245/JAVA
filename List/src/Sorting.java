import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(List.of(1,2,3,34,45,5,6,76));
        System.out.println("Original Numbers: "+number);
        Collections.sort(number);
        System.out.println("Sorted Number: "+number);

        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Reverse Sorted Number: "+number);

        List<String> people = new ArrayList<>(List.of("Nikil","Samprith","Ayush","Prathik"));

        people.sort((a,b)-> a.length() - b.length());
            for(String peoples : people){
                System.out.println(peoples);
            }
    }
}
