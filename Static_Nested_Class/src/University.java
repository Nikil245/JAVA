public class University {
    static  String College = "Mite";

    static class Student{
        String name;

        Student(String name){
            this.name=name;
        }

        void show(){
            System.out.println(name +" Studies in "+ College);
        }
    }
}
