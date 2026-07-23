abstract class Vehicle{
    abstract void start();

    void stop(){
        System.out.println("Vehicle Stop");
    }
}

class car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car start");
    }
}

class bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike start");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle v;
        
        v=new car();
        v.start();
        v.stop();

        v=new bike();
        v.start();
        v.stop();
    }
}
