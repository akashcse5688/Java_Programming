public class Employeee {
    String name;
    AddressInfo addressInfo;
    InsuranceInfo insuranceInfo;
    public Employeee(String name, AddressInfo addressInfo, InsuranceInfo insuranceInfo)
    {
        this.name=name;
        this.addressInfo=addressInfo;
        this.insuranceInfo=insuranceInfo;

    }
    public void display()
    {
        System.out.println("Name of Employee : "+this.name);
        System.out.println("Address of Employee: "+
                addressInfo.street+", "+addressInfo.city+", "+
                addressInfo.state+", "+addressInfo.postalCode);
        System.out.println("Insurance information: "+
                insuranceInfo.policyName+", "+insuranceInfo.policyId);
    }

}
