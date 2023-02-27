// Constructor using
public class Employee 
{
  

int Id;
   

String Name;
   

    //Createing a class constructor for the Employee class.
    public Employee (int Id, String Name) 
  {
    
 
this.Id = Id;
    

this.Name = Name;
  

} 
    //Display method
  void info () 
  {
    
 
System.out.println ("Name : " + Name);
    
 
System.out.println ("Id : " + Id);
  
 
} 
    //Main method
  public static void main (String[]args) 
  {
    
 
      //Createing an object of class Employee
      Employee emp1 = new Employee (5688, "Akash");	// Which will call the constructor. 
    
emp1.info ();

 
} 
} 
