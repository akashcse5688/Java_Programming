import java.util.Scanner;

public class Car extends Vehicle {

    public void run(){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the Car Speed  ");
        speed=input.nextInt();
        System.out.println("Car Speed is :"+speed);
    }

}
