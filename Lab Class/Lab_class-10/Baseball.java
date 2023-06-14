
package javaapplication13;

public class Baseball extends Ball{
    
    private String brandname;
    private int size;

    public Baseball(String brandname, int size) {
        this.brandname = brandname;
        this.size = size;
    }

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
    
    @Override
    public void toss()
    {
        System.out.println("Player toss the coin");
    }
    
    @Override
    public void bounce()
    {
        System.out.println("Baseball bounce after drop");
    }
}
