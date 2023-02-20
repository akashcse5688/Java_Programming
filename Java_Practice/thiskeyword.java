public class Student
{
  
    // Using this keywoard;
  String name;
  
String id;
  
String country;
  
Student (String name, String id)
  {
    
this.name = name;
    
this.id = id;
  
}
   
Student (String name, String id, String country)
  {
    
this (name, id);
    
this.country = country;
  
}
  
void display ()
  {
    
System.out.println (name);
    
System.out.println (id);
  
} 
void displyayinfo ()
  {
    
this.display ();
    
System.out.println (country);
  
} 
 
public static void main (String[]args)
  {
    
Student s1 = new Student ("Akash", "5688", "Bangladesh");
    
s1.displyayinfo ();

} 
} 
