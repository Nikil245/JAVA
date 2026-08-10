import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,4,4,5,2,6,4,3,6,7,8};

        HashMap<Integer,Integer> fre = new HashMap<>();

        for(int num : arr){
            fre.put(num,fre.getOrDefault(num,0)+1);
        }
        System.out.println(fre);

        String word = "Banana";
        HashMap<Character,Integer> words = new HashMap<>();
        for(char c : word.toCharArray()){
            words.put(c,words.getOrDefault(c,0)+1);
        }
        System.out.println(words);
    }
}
