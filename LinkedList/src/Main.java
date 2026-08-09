//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.addfront(11);
//        list.remove_front();
//        list.remove_back();
        boolean search = list.search(13);
        System.out.println(search);
        list.size();
        list.insertAt(14,3);
        list.deleteAt(4);
        list.display();
        list.reverse();
        list.display();
    }
}