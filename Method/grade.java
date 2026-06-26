import java.util.Scanner;

public class grade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name:");
        String Name=sc.nextLine();
        System.out.println("Enter Student Marks:");
        int Marks = sc.nextInt();
        char grades=calculate_grade(Marks);
        DisplayGrade(Name, grades);
    }

    public static char calculate_grade(int marks){
        char grade;
        if(marks >=90 && marks <=100){
            grade ='S';
        }else if(marks >=80 &&  marks <90){
            grade = 'A';
        }else if(marks >=70 &&  marks <80){
            grade = 'B';
        }else if(marks >=60 &&  marks <70){
            grade = 'C';
        }else if(marks >=50 &&  marks <60){
            grade = 'D';
        }else if(marks >=40 &&  marks <50){
            grade = 'E';
        }else{
            grade='F';
        }
        return grade;
    }

    public static void DisplayGrade(String name, char grades){
        System.out.println("The student name is:"+name);
        System.out.println("The student grade is:"+grades);
    }

}