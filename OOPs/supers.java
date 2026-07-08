class Animal {

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    Dog() {
        super();   // Calls Animal constructor
        System.out.println("Dog constructor called");
    }

    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        super.sound();   // Calls parent class method
        sound();         // Calls current class method
    }
}

public class supers {

     public static void main(String[] args) {

        Dog d = new Dog();

        System.out.println();

        d.display();
    }
}