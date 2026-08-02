public class Car {
    private String brand="BMW";
    private int speed=0;

    class Engine{
        void start(){
            System.out.println(brand +" Engine starting");
            speed=10;
        }
    }

    int getSpeed(){
            return speed;
    }
}
