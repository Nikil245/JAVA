class CellPhone {
    String brand;
    String model;
    int price;

    // Setter Methods
    void setBrand(String brand) {
        this.brand = brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setPrice(int price) {
        this.price = price;
    }

    // Display Method
    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
    }
}

public class set_mobile {

        public static void main(String[] args) {

        // Creating an object
        CellPhone phone1 = new CellPhone();

        // Setting values using setter methods
        phone1.setBrand("Samsung");
        phone1.setModel("Galaxy S25");
        phone1.setPrice(75000);

        // Display details
        phone1.displayDetails();
    }
}
