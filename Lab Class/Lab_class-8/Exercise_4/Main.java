public class Main {
    public static void main(String[] args) {
        AddressInfo addressInfo= new AddressInfo("Khagan", "Daffodil Smart city", "Dhaka", "1711");
        InsuranceInfo insuranceInfo =new InsuranceInfo("Life Insurance", 1234);
        Employeee employeee =new Employeee("Bappy",addressInfo, insuranceInfo );
        employeee.display();
    }
}
