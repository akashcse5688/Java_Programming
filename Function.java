import java.util.Scanner;


public class Main
{

  public static int sum (int a, int b)
  {

    int sum = a + b;

      return sum;

  }


  public static void main (String[]args)
  {

    Scanner number = new Scanner (System.in);
    System.out.println ("Enter first number= ");
    int a = number.nextInt ();
    System.out.println ("Enter second number= ");
    int b = number.nextInt ();

    int sum = sum (a, b);

    System.out.println ("The sum is = " + sum);

  }

}
