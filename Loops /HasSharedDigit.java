public class HasSharedDigit {

    public static void main(String[] args) {
             System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
         }


    public static boolean hasSharedDigit(int a, int b) {
        boolean answer = false;
        int lefta = a/10;
        int righta = a % 10;
        int leftb = b/10;
        int rightb = b % 10;
        if(lefta == leftb || lefta == rightb || righta == leftb || righta == rightb){
            answer = true;  
        }
        return answer;
    }
    }
