import java.util.Iterator;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();

        tree.add(14);
        tree.add(12);
        tree.add(11);
        tree.add(1);
        tree.add(5);
        tree.add(23);
        tree.add(4);

        System.out.println(tree);

        System.out.println("********************");
        System.out.println(tree.lower(5));
        System.out.println("********************");
        System.out.println(tree.higher(11));
        System.out.println("********************");
        System.out.println(tree.floor(13));
        System.out.println("********************");
        System.out.println(tree.ceiling(15));
        System.out.println("********************");
        System.out.println(tree.descendingSet());
        System.out.println("********************");

        Iterator<Integer> it = tree.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("********************");
        for(int x: tree){
            System.out.println(x);
        }
        System.out.println("********************");
        System.out.println(tree.headSet(12));
        System.out.println("********************");
        System.out.println(tree.tailSet(11));
        System.out.println("********************");
        System.out.println(tree.subSet(4,12));
    }
}