import java.util.Scanner;

public class Bike extends Vehicle{

    public void run(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the Bike Speed  ");
        speed=input.nextInt();
        System.out.println("Bike Speed is :"+speed);
    }
}
