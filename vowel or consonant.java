
import java.util.Scanner;

class Main
{

  public static void main (String[]args)
  {
    System.out.println ("Enter a character= ");
    Scanner number = new Scanner (System.in);
    char ch = number.next ().charAt (0);

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
      System.out.println (ch + " is vowel");
    else
        System.out.println (ch + " is consonant");

  }
}
