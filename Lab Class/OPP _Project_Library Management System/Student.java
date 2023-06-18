import java.util.InputMismatchException;
import java.util.Scanner;

public class Student extends library {
    void getDetails() {
        int id=0;
        int age=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("***Input the asked details***");

        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Enter Id  Number:");
                id = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n--Input Mistake try again--");
                sc.nextLine();
            }
        }

        System.out.println("Enter Name:");
        String name = sc.next();

        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Enter Age:");
                age = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n--Input Mistake try again--");
                sc.nextLine();
            }
        }

        System.out.println("Enter City:");
        String city = sc.next();

        System.out.println("Enter Course:");
        String course = sc.next();

        System.out.println("***Thanks for Log in your Details ***");
        System.out.println("Roll Number:" + id);
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("City:" + city);
        System.out.println("Course:" + course);
    }
}





