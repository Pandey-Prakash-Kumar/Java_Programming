package assignment_12;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        for (int i = 1;i<=10;i++)
            System.out.println(number+" X "+i+": "+number*i);
    }
}
