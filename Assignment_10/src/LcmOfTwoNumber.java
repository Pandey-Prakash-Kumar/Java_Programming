public class LcmOfTwoNumber {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a);
        System.out.println(b);
        if (a>b){
            first:
            for (int i=1;i<=a;i++) {
                for (int j = 1; j <= b; j++) {
                    if (a * i == b * j) {
                        int flag =1;
                        //System.out.println(a * i);
                        break first;
                    }

                }
            }



        }
        if (b>a){
            second:
            for (int i = 1; i <= b; i++) {
                for (int j = 1; j <= a; j++) {
                    if (b * i == a * j) {
                        System.out.println(b * i);
                        break second;
                    }


                }
            }
            //System.out.println(a*b);
        }
        if(a==b)
        {
            System.out.println(a);
        }

    }
}

