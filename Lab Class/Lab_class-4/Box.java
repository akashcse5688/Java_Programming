public class Box
{

  int height, weight, length;

  static void area (int h, int w)
  {

    int a = h * w;

      System.out.println ("area = " + a);

  }
  static void area (int h, int w, int l)
  {

    int a = h * w * l;

    System.out.println ("volume = " + a);

  }
  void display (int h, int w, int l)
  {

    System.out.println ("Height = " + h);

    System.out.println ("Weight = " + w);

    System.out.println ("Length = " + l);

  }
  public static void main (String[]args)
  {

    Box ob1 = new Box ();

    ob1.height = 56;

    ob1.weight = 15;

    ob1.length = 88;

    area (ob1.height, ob1.weight);

    area (ob1.height, ob1.weight, ob1.length);

    ob1.display (ob1.height, ob1.weight, ob1.length);

  }
}
