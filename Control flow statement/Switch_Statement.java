public class Switch_Statement {
        public static void main(String[] args) {
        String dayOfWeek = "MonDay";
        switch (dayOfWeek.toLowerCase()) {
            case "sunday":
                System.out.println("Today is Sunday");
                break;
            case "monday":
                System.out.println("Today is Monday");
                break;
            default:
                System.out.println("Unknown day");
                break;
        }
    }
}