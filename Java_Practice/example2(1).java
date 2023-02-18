public class Employee
{
  
private double age;
   
private double EID;
   
private String name;
   

public Employee (double age, double EID, String name)
  {
    
this.age = age;
    
this.EID = EID;
    
this.name = name;
  
} 

public void show ()
  {
    
System.out.println ("Name: " + name);
    
System.out.println ("Age: " + age);
    
System.out.println ("EID: " + EID);
  
} 
 
public String display (String name)
  {
    
System.out.println ("Name: " + name);
    
return name;
  
}
  
 
public void display ()
  {
    
System.out.println ("Name: " + name);
    
System.out.println ("Age: " + age);
  
} 
 
public double display (double EID)
  {
    
System.out.println ("EID: " + EID);
    
return EID;
  
}
  
 
public static void main (String[]args)
  {
    
Employee emp = new Employee (35.5, 12345, "John");
    
emp.show ();
    
emp.display ();
    
emp.display ("Mary");
    
emp.display (54321);

} 
} 
