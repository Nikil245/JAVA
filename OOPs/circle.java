class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        if (radius < 0) {
            radius = 0;
        }
        return radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        if (height < 0) {
            height = 0;
        }
        return height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}

    public class circle {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);

        System.out.println("Circle Details");
        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());

        System.out.println();

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("Cylinder Details");
        System.out.println("Radius = " + cylinder.getRadius());
        System.out.println("Height = " + cylinder.getHeight());
        System.out.println("Area = " + cylinder.getArea());
        System.out.println("Volume = " + cylinder.getVolume());
    }
}