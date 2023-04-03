import java.util.Scanner;


public class Main
{

  public static void main (String[]args)
  {

    Scanner input = new Scanner (System.in);


      System.out.print ("Enter a byte: ");

    byte myByte = input.nextByte ();


      System.out.print ("Enter a short: ");

    short myShort = input.nextShort ();


      System.out.print ("Enter an int: ");

    int myInt = input.nextInt ();


      System.out.print ("Enter a long: ");

    long myLong = input.nextLong ();


      System.out.print ("Enter a float: ");

    float myFloat = input.nextFloat ();


      System.out.print ("Enter a double: ");

    double myDouble = input.nextDouble ();


      System.out.print ("Enter a boolean (true or false): ");

    boolean myBoolean = input.nextBoolean ();


      System.out.println ("Byte: " + myByte);

      System.out.println ("Short: " + myShort);

      System.out.println ("Int: " + myInt);

      System.out.println ("Long: " + myLong);

      System.out.println ("Float: " + myFloat);

      System.out.println ("Double: " + myDouble);

      System.out.println ("Boolean: " + myBoolean);


      input.close ();

  }
}

//Output{
  //Enter a byte: 8
  //Enter a short: 3
  //Enter an int: 456
  //Enter a long: 67867
  //Enter a float: 6786.665
  //Enter a double: 556466778
  //Enter a boolean (true or false): false
  //Byte: 8
  //Short: 3
  //Int: 456
  //Long: 67867
  //Float: 6786.665
  //Double: 5.56466778E8
  //Boolean: false
//}
