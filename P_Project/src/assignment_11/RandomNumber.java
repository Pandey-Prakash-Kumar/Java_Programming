package assignment_11;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random r1  = new Random();
        int min = 1;
        int max = 100;
        int random = r1.nextInt(max-min+1)+min;
        System.out.println(random);
    }

}
