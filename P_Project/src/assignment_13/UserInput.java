package assignment_13;

public class UserInput {

    public void isEvenOdd(int num){
        if (num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
    public int greatestNumber(int num1,int num2,int num3){
        if (num1>num2 && num1>num3)
            return num1;
        else if (num2>num3 && num2>num1)
            return num2;
        else
            return num3;
    }
    public int countDigit(String num){
        return num.length();
    }
    public int reverseNumber(int num) {
        int reversedNum = 0;
        while ((num != 0)) {
            int r = num % 10;
            reversedNum = reversedNum * 10 + r;
            num = num / 10;
        }
        return reversedNum;
    }
    public int sumOfFirstNum(int num){
        int sum = 0;
        for (int i = 1;i<=num;i++)
            sum = sum+i;

        return sum;
    }
    public int sumOfFirstOddNum(int num){
        int sum = 0;
        for (int i = 0;i<num;i++)
             sum = sum+((i*2)+1);

        return sum;
    }
    public int sumOfFirstEvenNum(int num){
        int sum = 0;
        for (int i = 1;i<=num;i++)
            sum = sum+((i*2));

        return sum;
    }
    public int sumOfSquareOfFirstNum(int num){
        int sum = 0;
        for (int i = 1;i<num;i++)
            sum = sum+(i*i);

        return sum;
    }
    public int sumOfDigit(int num){
        int sum = 0;
        while(num!=0) {
            int digit = num%10;
            sum = sum+digit;
            num =num/10;
        }

       return sum;
    }
    public int factorial(int num){
        int fact = 1;
        for (int i = 1;i<=num;i++)
            fact = fact*i;

        return fact;
    }



}


