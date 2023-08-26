public class Circle {
    float radius;
    void setRadius(float radius){
        this.radius=radius;
    }
    public float area(){
        return 3.14f*radius*radius;
    }
    public float circumference(){
        return 2*3.14f*radius;
    }
}
