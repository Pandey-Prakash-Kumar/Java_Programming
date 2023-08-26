public class GreaterAmongThreeNum {
    public static void main(String[] args) {
        int x =50, y=10, z=90;
        if (x>y && x>z)
            System.out.println(x+" is greater");
        else if(y>x && y>z)
            System.out.println(y+" is greater");
        else
            System.out.println(z+" is greater");
    }
}
