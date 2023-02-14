public class Sum
{
  
void Add (int n)
  {
    
int sum = 0;
     
for (int i = 1; i <= n; i++)
      {
	
sum += i;
      
} 
System.out.println (sum);
  
} 
public static void main (String[]args)
  {
    
int num = 10;
    
Sum obj = new Sum ();
    
obj.Add (num);

 
} 
}
