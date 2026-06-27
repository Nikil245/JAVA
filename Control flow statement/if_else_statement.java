public class if_else_statement {

      public static void main(String[] args) {
        
        int studentScore = 88;
        
        if (studentScore >= 100) {
            System.out.println("You scored S grade");
        } 
        else if (studentScore > 90 && studentScore < 100) {
            System.out.println("You scored A grade");
        } 
        else if (studentScore > 80 && studentScore < 91) {
            System.out.println("You scored B grade");
        } 
        else {
            System.out.println("You failed");
        }
    }
}