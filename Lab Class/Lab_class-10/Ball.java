package javaapplication13;

public abstract class Ball {

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
    public abstract void toss();
    public abstract void bounce();

}
