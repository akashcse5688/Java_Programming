public class Student
{
  

    // attributes
  private int age;
   
private double salary;
   
private String id;
   

    // constructor
    public Student (int age, double salary, String id)
  {
    
this.age = age;
    
this.salary = salary;
    
this.id = id;
  
} 

    // methods
    public void display ()
  {
    
System.out.println ("Age: " + age);
    
System.out.println ("Salary: " + salary);
    
System.out.println ("ID: " + id);
  
} 
 
public int display (int age)
  {
    
System.out.println ("Age: " + age);
    
return age;
  
}
  
 
public double display (double salary)
  {
    
System.out.println ("Salary: " + salary);
    
return salary;
  
}
  
 
public static void main (String[]args)
  {
    
Student s1 = new Student (22, 44, "5688");
    
s1.display ();
    
s1.display (27);
    
s1.display (34242);

} 
} 
