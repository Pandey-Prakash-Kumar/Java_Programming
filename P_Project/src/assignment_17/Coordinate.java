package assignment_17;

public class Coordinate {
    int x,y;

    public Coordinate(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double getDistance(){
        return Math.sqrt(y*y+x*x);
    }
    public double getDistance(Coordinate p2){
        return Math.sqrt((x-p2.x)*(x-p2.x)+(y-p2.y)*(y-p2.y));
    }

    public static void main(String[] args) {
        Coordinate p1 = new Coordinate(3,4);
        System.out.println(String.format("%.2f",p1.getDistance()));
        Coordinate p2 = new Coordinate(5,9);
        System.out.println(String.format("%.3f",p1.getDistance(p2)));

    }
}
