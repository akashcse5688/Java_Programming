public class Student
{
  
private int age;
   
private double salary;
   
private String id;
   

public Student (int age, double salary, String id)
  {
    
this.age = age;
    
this.salary = salary;
    
this.id = id;
  
} 

public void display ()
  {
    
System.out.println ("Student ID: " + id);
    
System.out.println ("Student Age: " + age);
    
System.out.println ("Student Salary: " + salary);
  
} 
 
public int display (int age)
  {
    
System.out.println ("Age " + age);
    
 
return age;
  
}
  
 
public double display (double salary)
  {
    
System.out.println ("Salary " + salary);
    
 
return salary;
  
}

 
}


