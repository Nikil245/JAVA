class Mobile{
    String Brand;
    String Model;
    int price;
    

    Mobile(String Brand, String Model, int price){
        this.Brand=Brand;
        this.Model=Model;
        this.price=price;
    }

    void displayMobileInfo(){
        System.out.println("The Brand of the mobile phone:"+Brand);
        System.out.println("The Model of the mobile phone:"+Model);
        System.out.println("The Price of the mobile phone:"+price);
    }
}

public class mobile_class{
    public static void main(String[] args) {
        Mobile phone1 = new Mobile("Iphone","17 Pro Max",159999);
        Mobile phone2 = new Mobile("Samsung","S26 ultra",139999);
        Mobile phone3 = new Mobile("One plus ","One plus 15",89999);
        
        phone1.displayMobileInfo();
        System.out.println("************************************");
        phone2.displayMobileInfo();
        System.out.println("************************************");
        phone3.displayMobileInfo();
        System.out.println("************************************");

    }
}