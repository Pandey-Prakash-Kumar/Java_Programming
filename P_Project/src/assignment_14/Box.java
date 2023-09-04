package assignment_14;

public class Box {
    private int length,breadth,height;
    protected double volume;
    protected double surfaceArea;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
    public double calculateVolume(){
        return 2*(length*breadth*height);
    }
    public double calculateSurfaceArea(){
        return 2*(length*breadth+breadth*height+length*height);
    }
}
