public class Teacher
{
  
private String name;
  
private String gender;
  
private int age;
   

public int getAge ()
  {
    
return age;
  
}
   

public void setAge (int age)
  {
    
this.age = age;
  
} 
 
public String getGender ()
  {
    
return gender;
  
}
  
 
public void setGender (String gender)
  {
    
this.gender = gender;
  
} 
 
public void setName (String name)
  {
    
this.name = name;
  
 
} 
public String getName ()
  {
    
 
return name;
  
}
  
 
public static void main (String[]args)
  {
    
Teacher teacher1 = new Teacher ();
    
teacher1.setName ("Rakibul");
    
teacher1.setGender ("male");
    
teacher1.setAge (22);
    
System.out.println (teacher1.getName ());
    
System.out.println (teacher1.getGender ());
    
System.out.println (teacher1.getAge ());

} 
} 
