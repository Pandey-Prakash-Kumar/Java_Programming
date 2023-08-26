public class CheckCharacter {
    public static void main(String[] args) {
        char ch = '0';
        if (ch >= 'a' && ch <='z' || ch >= 'A' && ch <='Z')
            System.out.println("It's an alphabet");
        else if(ch >= '0' && ch <= '9')
            System.out.println("It's a digit");
        else
            System.out.println("Some other character");
    }
}
