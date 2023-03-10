public class Adresinfo
{
  
String sterct;
  
String city;
  
String state;
  
String postalcode;
  

Adresinfo (String sterct, String city, String state, String postalcode)
  {
    
this.city = city;
    
this.postalcode = postalcode;
    
this.state = state;
    
this.sterct = sterct;
  


}
 
}
 
public class Insurenceinfo
{
  
 
String policname;
  
int policyid;
  
 
Insurenceinfo (String policname, int policyid)
  {
    
this.policname = policname;
    
this.policyid = policyid;
  
} 
 
public class Employe
  {
    
String name;
    
Adresinfo adresinfo;
    
Insurenceinfo insurenceinfo;
    
 
Employe (String name, Adresinfo adresinfo, Insurenceinfo insurenceinfo)
    {
      
this.name = name;
      
this.adresinfo = adresinfo;
      
this.insurenceinfo = insurenceinfo;
    
} 
void displayinfo ()
    {
      
System.out.println (name);
      
System.out.println (adresinfo.city);
      
System.out.println (adresinfo.sterct);
      
System.out.println (adresinfo.state);
      
System.out.println (adresinfo.postalcode);
      
System.out.println (insurenceinfo.policname);
      
System.out.println (insurenceinfo.policyid);
    
} 
 
public static void main (String[]args)
    {
      
Adresinfo adresinfo =
	new Adresinfo ("Sector 4", "Uttara", "Dhaka", "1711");
      
Insurenceinfo insurenceinfo =
	new Insurenceinfo ("Life Insurance", 123);
      
Employe employe = new Employe ("AKASH", adresinfo, insurenceinfo);
  
 
 
} 
} 
 
 
 
 
 
 
