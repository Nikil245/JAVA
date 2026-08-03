import java.nio.file.LinkOption;
import java.util.LinkedList;
import java.util.List;

public class LindedList {
    public static void main(String[] args) {
        List<Integer> Linkedlist = new LinkedList<>();
        Linkedlist.addFirst(3);
        Linkedlist.addLast(5);
        Linkedlist.addFirst(1);
        System.out.println(Linkedlist);

    }
}
