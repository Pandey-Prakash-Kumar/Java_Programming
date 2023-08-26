public class FilterPrimeNumbers {
    int n;

    static void checkPrime(int x) {
        int flag = 0;
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                flag = 1;
        }
        if (flag == 0)
            System.out.println(x);


    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            checkPrime(Integer.parseInt(args[i]));
        }
    }
}
