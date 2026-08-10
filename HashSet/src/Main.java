import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);

        System.out.println(numbers);
        System.out.println(numbers.contains(3));
        System.out.println(numbers.remove(2));
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());

        numbers.forEach(nums->{
            System.out.println(nums);
        });
        int[] arr = {1,2,3,4,5,6,1,2,3,7,8,9,4,6,2,7,};
        Set<Integer> nums = new HashSet<>();

        for(int num : arr){
            nums.add(num);
        }
        System.out.println(nums);

    }
}