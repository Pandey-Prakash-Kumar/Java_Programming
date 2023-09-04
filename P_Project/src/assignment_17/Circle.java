package assignment_17;

public class Circle {
    private int radius;
    public void setRadius(int r){
        radius=r;
    }
    public int getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

}
class ThickCircle extends Circle{
    private int thickness;

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public int getThickness() {
        return thickness;
    }
    public double getArea(){
        return Math.PI*(getRadius()+thickness)*(getRadius()+thickness)-super.getArea();
    }



}
