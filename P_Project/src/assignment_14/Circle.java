package assignment_14;

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float calculateArea(){
        return 3.14f*radius*radius;
    }
    public float calculateCircumference(){
        return 2*3.14f*radius;
    }
}
