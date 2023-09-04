package assignment_12;
import java.util.Scanner;
public class SquareOfFirstNNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        for (int i = 1;i<=number;i++)
            System.out.println("Square of "+i+": "+i*i);
    }
}
