class Cuboid{
    private int length, width, height;
    public void setLength(int l){ length=l; }
    public void setWidth(int w){ width=w; }
    public void setHeight(int h){ height=h; }
    public int getLength(){ return length; }
    public  int getWidth(){ return width; }
    public int getHeight(){ return height; }
    public int getVolume(){ return length*width*height;}
    public int getSurfaceArea(){ return 2*(length*width*height);}

}
public class Class3 {
    public static void main(String[] args) {
    Cuboid c1 = new Cuboid();

    //c1 = new Cuboid();
    //c1.getters();
    }
}
