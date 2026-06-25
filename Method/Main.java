public class Main {
    public static void main(String[] args) {
        // Calling perimeter method
        perimeterOfRect(10, 20);
        perimeterOfRect(20, 30);

        // Calculate speed
        double topspeed = speedofObject(200, 20); // 200 / 20 = 10
        double x = 40 * topspeed;
        System.out.println(x); // Output: 400
    }
    
    // Method to calculate perimeter
    public static void perimeterOfRect(int length, int breadth) {
        double perimeter = 2 * (length + breadth);
        System.out.println("The perimeter is: " + perimeter);
    }

    // Method to calculate speed
    public static double speedofObject(double distance, double time) {
        return distance / time; // Always calculate speed
    }
}
