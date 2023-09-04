package assignment_12;
import java.util.Scanner;
public class FirstNEvenNum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        for (int i=1;i<=x;i++)
            System.out.println(i*2);
    }
}
