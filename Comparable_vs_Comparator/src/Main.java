    import java.util.ArrayList;
    import java.util.Collections;

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
            ArrayList<PhoneDirectory> pd = new ArrayList<>();

            pd.add(new PhoneDirectory("Joker","4646464"));
            pd.add(new PhoneDirectory("Spider Man","54545454"));
            pd.add(new PhoneDirectory("Iron Man","8646546"));
            pd.add(new PhoneDirectory("Bat Man","7897865"));
            pd.add(new PhoneDirectory("SuperMan","85466456"));
            pd.add(new PhoneDirectory("Wanda","1212121"));
            pd.add(new PhoneDirectory("Balck Widow","8745466"));
            pd.add(new PhoneDirectory("Pink Panther","23264545"));

            Collections.sort(pd);

            for(PhoneDirectory obj : pd){
                System.out.println(obj.getContactName()+ " " + obj.getContactNumber());
            }
        }
    }