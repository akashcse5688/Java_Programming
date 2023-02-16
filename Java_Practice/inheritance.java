public class Person
{
  
String name;
  
String age;
  
void displayinfomation ()
  {
    
System.out.println (name);
    
System.out.println (age);
  

} 
public class Student extends Person
  {
    
 
String univasity;
    
 
void displayinfomation1 ()
    {
      
displayinfomation ();
      
System.out.println (univasity);
  
 
 
} 
} 
public class Main
  {
    
public static void main (String[]args)
    {
      
Student s1 = new Student ();
      
s1.name = "AKASH";
      
s1.age = "22";
      
s1.univasity = "DIU";
      
s1.displayinfomation1 ();
  
} 
}
