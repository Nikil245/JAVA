class Employee{
    private String Name;
    private int Salary;


    public void setName(String name){
        Name=name;
    }

    public String GetName(){
        return Name;
    }

    public void setSalary(int salary){
        if(salary>0){
            Salary=salary;
        }else{
            System.out.println("Invalid Salary");
        }
    }

    public int getSalary(){
        return Salary;
    }
}


public class Employees {

    public static void main(String[] args) {
        Employee emp1= new Employee();
        emp1.setName("Nikil");
        String name=emp1.GetName();
        System.out.println("Name of the employee:"+name);
        emp1.setSalary(20000);
        int Salary=emp1.getSalary();
        System.out.println("Salary:"+Salary);
    }
}