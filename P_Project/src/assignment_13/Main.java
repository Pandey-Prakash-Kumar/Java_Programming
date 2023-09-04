package assignment_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInput u1 = new UserInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(u1.factorial(num));
//        String num = sc.next();
//        System.out.println(u1.countDigit(num));
//        int num1 = sc.nextInt();
//        System.out.println(u1.reverseNumber(num1));

    }
}
