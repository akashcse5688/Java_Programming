
import java.util.Scanner;

class Main
{

  public static void main (String[]args)
  {
    Scanner number = new Scanner (System.in);
      System.out.println ("Enter the first number:");
    int a = number.nextInt ();
      System.out.println ("Enter the second number:");
    int b = number.nextInt ();
      System.out.println ("Enter the third number:");
    int c = number.nextInt ();

    if (a >= b && a >= c)
        System.out.println (a + " is the largest number.");

    else if (b >= a && b >= c)
        System.out.println (b + " is the largest number.");

    else
        System.out.println (c + " is the largest number.");
  }
}
