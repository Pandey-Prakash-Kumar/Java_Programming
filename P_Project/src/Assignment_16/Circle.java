package Assignment_16;

public class Circle {
    private int radius;
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    public double calculateArea(){
        return 3.14*radius*radius;
    }

}
class ThickCircle extends Circle{
    private int thickness;
    public void thArea(){

    }
    public void hollowArea(){

    }
}
