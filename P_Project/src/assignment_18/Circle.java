package assignment_18;

public class Circle {
    private int radius;
    static final double PI;
    static {
        PI=3.14;
    }
    {
        radius=5;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public double area(){
        return PI*radius*radius;
    }
}
