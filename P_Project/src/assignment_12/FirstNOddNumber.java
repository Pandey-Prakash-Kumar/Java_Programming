package assignment_12;
import java.util.Scanner;
public class FirstNOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        for (int i =0;i<a;i++)
            System.out.println((i*2)+1);
    }
}
