//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        t1.start();

        MyTask task1 = new MyTask();
        Thread t2 = new Thread(task1);

        t2.start();

        sleeping s1 = new sleeping();
        s1.start();
    }
}