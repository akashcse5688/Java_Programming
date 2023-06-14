
package javaapplication13;

public class Football extends Ball{

    private String brandname;
    private int size;

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Football(String brandname, int size) {
        this.brandname = brandname;
        this.size = size;
    }
    
    @Override
    public void toss()
    {
        System.out.println("Player toss the coin");
    }
    
    @Override
    public void bounce()
    {
        System.out.println("Football bounce after kick");
    }
  
}
