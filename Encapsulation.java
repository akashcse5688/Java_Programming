public class Student
{
  
private String name;
  
private String id;
  
private int age;
   

public String getId ()
  {
    
return id;
  
}
   

public void setId (String id)
  {
    
this.id = id;
  
} 
 
public void setName (String name)
  {
    
this.name = name;
  
} 
public String getName ()
  {
    
return name;
  
}
  
public void setAge (int age)
  {
    
this.age = age;
  
} 
public int getAge ()
  {
    
return age;
  
}
  
 
public static void main (String[]args)
  {
    
Student person1 = new Student ();
    
person1.setName ("RAKIBUL HASAN AKASH");
    
person1.setId ("221-15-5688");
    
person1.setAge (22);
    
System.out.println (person1.getName ());
    
System.out.println (person1.getAge ());
    
System.out.println (person1.getId ());

} 
 
}
