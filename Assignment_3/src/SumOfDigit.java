public class SumOfDigit {
    public static void main(String[] args) {
        int n = 234;
        int sum = 0;
        int remainder;
        remainder = n%10;
        sum = sum + remainder;
        n = n/10;
        remainder = n%10;
        sum = sum + remainder;
        n = n/10;
        sum = sum + n;
        System.out.println(sum);
    }
}
