public class ReverseDigit {
    public static void main(String[] args) {
        int num = 543;
        int reversedNumber=0;
        int rem = num%10;
        num = num/10;
        int rem1 = num%10;
        num = num/10;
        reversedNumber = (rem*100)+(rem1*10)+num;
        System.out.println(reversedNumber);


    }
}
