public class Student
{
    String firstName;
    String lastName;
    int marks;
  
    public String getFirstName ()
    {
        return firstName;
    }
    
    public String getLastName ()
    {
        return lastName;
    }
    
    public int getMarks ()
    {
        return marks;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }
  
    public void setMarks (int marks)
    {
        if (marks < 0 || marks > 100)
            this.marks = 0;
        else
            this.marks = marks;
    }
 
    public boolean isPass ()
    {
        if (marks >= 33 && marks <= 100)
          return true;
        else
            return false;
    }
  
    public String getFullName ()
    {
        String first = getFirstName ();
        String last = getLastName ();
        
        if (first.isEmpty () && last.isEmpty ())
            return "";
        else if (last.isEmpty ())
            return first;
        else if (first.isEmpty ())
            return last;
        else
            return first + " " + last;
    }
  
    public static void main (String[]args)
    {
        Student student = new Student ();
        student.setFirstName ("");	// firstName is set to empty string
        student.setLastName ("");	// lastName is set to empty string
        student.setMarks (10);
        System.out.println ("fullName= " + student.getFullName ());
        System.out.println ("pass= " + student.isPass ());
        student.setFirstName ("Sudhir");	// firstName is set to Sudhir
        student.setMarks (80);
        System.out.println ("fullName= " + student.getFullName ());
        System.out.println ("pass= " + student.isPass ());
        student.setLastName ("Dhangar");	// lastName is set to Dhangar
        System.out.println ("fullName= " + student.getFullName ());
    }
}