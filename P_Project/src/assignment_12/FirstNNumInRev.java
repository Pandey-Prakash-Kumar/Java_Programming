package assignment_12;

import java.util.Scanner;

public class FirstNNumInRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++)
            System.out.println(n+1-i);
    }
}
