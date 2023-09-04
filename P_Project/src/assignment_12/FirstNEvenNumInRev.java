package assignment_12;
import java.util.Scanner;
public class FirstNEvenNumInRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i=num;i>=1;i--)
            System.out.println((i*2));
    }
}
