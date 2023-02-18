public class Student
{

  int age;

  double salary;

  private String id;

    Student (String id)
  {

    this.id = id;


  }
  void display ()
  {

    System.out.println (id);

  }
  public int display (int age)
  {

    this.age = age;

    System.out.println (age);

    return 1;

  }

  public double display (double salary)
  {

    this.salary = salary;

    System.out.println (salary);

    return 1;

  }


  public static void main (String[]args)
  {

    Student s1 = new Student ("221-15-5688");

    s1.display ();

    s1.display (22);

    s1.display (25000.9);

  }
}
