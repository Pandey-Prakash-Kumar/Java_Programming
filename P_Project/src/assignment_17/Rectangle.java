package assignment_17;

public class Rectangle {
    private int length, breadth;
    String borderColour;
    public void setLength(int l){
        length=l;
    }
    public int getLength(){
        return length;
    }
    public void setBreadth(int b){
        breadth=b;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBorderColour(String bColour){
        borderColour=bColour;
    }
    public String getBorderColour(){
        return borderColour;
    }
    public void printRectangleColour(){
        System.out.println("Border Colour - "+getBorderColour());
    }
}
class FilledRectangle extends Rectangle{
    String fillColour;

    public void setFillColour(String fillColour) {
        this.fillColour = fillColour;
    }

    public String getFillColour() {
        return fillColour;
    }

    @Override
    public void printRectangleColour() {
        super.printRectangleColour();
        System.out.println("Filled Colour - "+getFillColour());

    }
}
