public class Box
{
  
int heigth;
   
int weigth;
   
int length;
   
public static int area (int a, int b)
  {
    
return a * b;
  
}
   
public static int area (int a, int b, int c)
  {
    
return a * b * b;
  
}
  
void display ()
  {
    
System.out.println (heigth);
    
System.out.println (weigth);
    
System.out.println (length);
  
 
} 
public static void main (String[]args)
  {
    
 
Box box1 = new Box ();
    
box1.heigth = 12;
    
box1.weigth = 2;
    
box1.length = 4;
    
System.out.println (area (12, 2));
    
System.out.println (area (12, 2, 4));
    
box1.display ();

 
 
} 
}
