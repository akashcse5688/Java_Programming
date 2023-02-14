public class Student
{
  
String Name;
  
int age;
   
String Id;
   
float Cgpa;
   
void display ()
  {
    
System.out.println ("Name:" + Name);
    
System.out.println ("ID:" + Id);
    
System.out.println ("Age:" + age);
    
System.out.println ("CGPA:" + Cgpa);
  
} 
public static void main (String[]args)
  {
    
Student S1 = new Student ();
    
S1.Name = "Rakibul hasan Akash";
    
S1.Id = "221-15-5688";
    
S1.age = 22;
    
S1.Cgpa = 3.37f;
    
S1.display ();

} 
}
