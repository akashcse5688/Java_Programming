public class Volvo extends Car1{
    double price;
    String productionYear;
    String registrationNumber;
    Engine eng;
    DashBoard db;
    public Volvo(double price, String productionYear, String registrationNumber, Engine eng, DashBoard db)
    {
        this.price=price;
        this.productionYear=productionYear;
        this.registrationNumber=registrationNumber;
        this.eng=eng;
        this.db=db;
    }
    public void changeFuel()
    {
        System.out.println("Changing Fuel");
    }
    public void checkBattery()
    {
        System.out.println("Checking battery");
    }
}
