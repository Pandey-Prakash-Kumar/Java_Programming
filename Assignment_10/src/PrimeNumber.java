public class PrimeNumber {
    int n;
    static void checkPrime(int x){
        int flag = 0;
        for (int i =2;i<x;i++){
            if (x%i==0)
                flag = 1;
        }
        if (flag == 1)
            System.out.println(x+" is not prime Number");
        else
            System.out.println(x+" is Prime Number");
    }
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        checkPrime(num);


    }
}
