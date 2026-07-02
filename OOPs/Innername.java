class name{
    String FirstName;
    String LastName;

    void set_first_name(String FirstName){
        this.FirstName=FirstName;
    }

    void set_last_name(String LastName){
        this.LastName=LastName;
    }

    void get_first_name(){
        System.out.println(FirstName);
    }

    void get_last_name(){
        System.out.println(LastName);
    }

    void Full_name(){
        System.out.println(FirstName+" "+LastName);
    }
}

public class Innername {
    public static void main(String[] args) {
        name name1 = new name();

        name1.set_first_name("Rama");
        name1.set_last_name("Nandha");
        name1.get_first_name();
        name1.get_last_name();
        name1.Full_name();
    }
    
}