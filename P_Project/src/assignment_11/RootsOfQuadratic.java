package assignment_11;

public class RootsOfQuadratic {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 2;
        int d = (b*b)-(4*a*c);
        double root1 = (-b+Math.sqrt(d))/(2*a);
        double root2 = (-b-Math.sqrt(d))/(2*a);
        System.out.println("Roots are "+root1+" "+root2);
    }
}
