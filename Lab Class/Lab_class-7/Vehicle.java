import java.util.Scanner;

public class Vehicle {
    int speed;
    public void run(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Vehicle Speed  ");
        this.speed=input.nextInt();
        System.out.println("Vehicle Speed is :"+speed);
    }
}
