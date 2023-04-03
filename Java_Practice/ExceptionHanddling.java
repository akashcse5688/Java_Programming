import java.util.Scanner;

 
public class Handding
{
  
public static void main (String[]args)
  {
    
Scanner sc = new Scanner (System.in);
    
 
try
    {
      
System.out.println ("Enter your first number= ");
      
int a = sc.nextInt ();
      
System.out.println ("Enter your Second Number= ");
      
int b = sc.nextInt ();
      
int result = a / b;
      
System.out.println ("Your result is= " + result);
    
} catch (ArithmeticException e)
    {
      
System.out.println (e);
      
System.out.println (" Please Enter your correct number= ");
    
} 
try
    {
      
int[] a = new int[5];
      
System.out.println ("Enter array number= ");
      
for (int i = 0; i < 5; i++)
	{
	  
a[i] = sc.nextInt ();
	
} 
System.out.println (a[10]);
    
} catch (ArrayIndexOutOfBoundsException e)
    {
      
System.out.println (e);
      
System.out.println ("your array size overflow");
    
} 
try
    {
      
String s = null;
      
System.out.println (s.length ());
    
} 
catch (NullPointerException e)
    {
      
System.out.println (e);
      
System.out.println ("you donot find the length beacuse its null");
    
} 
try
    {
      
String s = "RAKIB";
      
int i = Integer.parseInt (s);
    
} 
catch (NumberFormatException e)
    {
      
System.out.println (e);
      
System.out.println ("you dont have number format String to integer");
    
} 
finally
    {
      
System.out.println ("YOU DONE ALL EXCEPTION ERROR");
    
} 
System.out.println ("GOOD BYE MAIN METHOD");

} 
} 
