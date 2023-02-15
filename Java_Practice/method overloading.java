public class MethodOverload
{
  
int a;
   
int b;
   
int c;
   
void add (int a, int b)
  {
    
this.a = a;
    
this.b = b;
    
System.out.println (a + b);
  
} 
void add (int a, int b, int c)
  {
    
this.a = a;
    
this.b = b;
    
System.out.println (a + b + c);
  
} 
void add ()
  {
    
System.out.println ("i am do nothing");
  
} 
 
public static void main (String[]args)
  {
    
MethodOverload a1 = new MethodOverload ();
    
a1.add ();
    
a1.add (2, 4);
    
a1.add (2, 4, 6);

} 
}
